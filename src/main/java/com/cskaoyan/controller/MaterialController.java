package com.cskaoyan.controller;

import com.cskaoyan.bean.Material;
import com.cskaoyan.bean.Tip;
import com.cskaoyan.service.MaterialService;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("material")
public class MaterialController {

    @Autowired
    MaterialService materialService;

    //从home界面，显示material_list
   @RequestMapping("find")
    public String find(){
        return "material_list";
    }

    //显示material_list界面的material数据
    @RequestMapping("list")
    @ResponseBody
    public List<Material> materialList(Integer page,Integer rows) {
        List<Material> allMaterialList = materialService.selectAllMaterial();
        //总记录数
        int totalRecordsNum = allMaterialList.size();
        int limit = rows;
        int offset = (page-1)*rows;
        //这里有个问题就是分页
        List<Material> materialList = materialService.selectPageMaterial(limit, offset);
        return materialList;
    }

    //新添material验证
    @RequestMapping("*_judge")
    @ResponseBody
    public String add_judge(){
        return "";
    }

    //添加material的界面
    @RequestMapping("add")
    public String add(){
       return "material_add";
    }

    //添加material操作
    @RequestMapping("insert")
    @ResponseBody
    public Tip insert(Material material) {
       int result = materialService.insertOneMaterial(material);
       Tip tip;
       if(result==1){
           tip = new Tip("200","物料添加成功",null);;
       } else{
           tip = new Tip("500","物料添加失败",null);
       }
       return tip;
    }

    //更新界面
    @RequestMapping("edit")
    public String edit(){
        return "material_edit";
    }

    @RequestMapping("update_all")
    @ResponseBody
    public Tip update_all(Material material) {
       int result = materialService.updateMaterial(material);
        Tip tip;
        if(result==1){
            tip = new Tip("200","物料修改成功",null);;
        } else{
            tip = new Tip("500","物料修改失败",null);
        }
        return tip;
    }

    @RequestMapping("delete_batch")
    @ResponseBody
    public Tip delete_batch(@RequestParam("ids") String[] ids) {
       int count = 0;
        for (String id : ids) {
            int result = materialService.deleteOneMaterial(id);
            //这边有bug
            if (result == 1) {
                count++;
            }
        }
        Tip tip;
        if(count == ids.length){
            tip = new Tip("200","物料修改成功",null);;
        } else{
            tip = new Tip("500","物料修改失败",null);
        }
        return tip;
    }

    //按materialId查找material
    @RequestMapping("search_material_by_materialId")
    @ResponseBody
    public List<Material> search_material_by_materialId(String searchValue,int page,int rows) {
       int limit = rows;
       int offset = (page - 1) * rows;
        List<Material> materialList = materialService.selectSearchPageMaterialById(searchValue,limit,offset);
       return materialList;
    }

    //按materialType查找material
    @RequestMapping("search_material_by_materialType")
    @ResponseBody
    public List<Material>search_material_by_materialType(String searchValue, int page, int rows) {
        int limit = rows;
        int offset = (page - 1) * rows;
        List<Material> materialList = materialService.selectSearchPageMaterialByType(searchValue,limit,offset);
        return materialList;
    }

    //MaterialReceive里面要使用material
    @RequestMapping("get_data")
    @ResponseBody
    public List<Material> get_data() {
        List<Material> materialList = materialService.selectAllMaterial();
        return  materialList;
    }
}
