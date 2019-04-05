package com.cskaoyan.controller;


import com.cskaoyan.bean.MaterialReceive;
import com.cskaoyan.bean.Tip;
import com.cskaoyan.service.MaterialReceiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("materialReceive")
public class MaterialReceiveController {

    @Autowired
    MaterialReceiveService materialReceiveService;

    @RequestMapping("find")
    public String find() {
        return "materialReceive_list";
    }

    //查找materialreceive
    @RequestMapping("list")
    @ResponseBody
    public Map list(int page, int rows) {
        int limit = rows;
        int offset = (page - 1) * rows;
        List<MaterialReceive> materialReceiveList = materialReceiveService.selectPageMaterialReceive(limit, offset);
        Map<String,Object> hashMap = new HashMap<>();
        hashMap.put("total",materialReceiveList.size());
        hashMap.put("rows",materialReceiveList);
        return hashMap;
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
        return "materialReceive_add";
    }

    //添加material操作
    @RequestMapping("insert")
    @ResponseBody
    public Tip insert(MaterialReceive materialReceive) {
        int result = materialReceiveService.insertOneMaterialReceive(materialReceive);
        Tip tip;
        if(result==1){
            tip = new Tip("200","物料收入添加成功",null);;
        } else{
            tip = new Tip("500","物料收入添加失败",null);
        }
        return tip;
    }

    //更新界面
    @RequestMapping("edit")
    public String edit(){
        return "materialReceive_edit";
    }

    @RequestMapping("update_all")
    @ResponseBody
    public Tip update_all(MaterialReceive materialReceive) {
        int result = materialReceiveService.updateMaterialReceive(materialReceive);
        Tip tip;
        if(result==1){
            tip = new Tip("200","物料收入修改成功",null);;
        } else{
            tip = new Tip("500","物料收入修改失败",null);
        }
        return tip;
    }

    /*@RequestMapping("update_note")
    @ResponseBody
    public Tip update_note(String receiveId,String note){
        int result = materialReceiveService.updateMaterialReceiveNoteById(receiveId,note);
        Tip tip;
        if(result==1){
            tip = new Tip("200","物料消费修改成功",null);;
        } else{
            tip = new Tip("500","物料消费修改失败",null);
        }
        return tip;
    }*/

    @RequestMapping("delete_batch")
    @ResponseBody
    public Tip delete_batch(@RequestParam("ids") String[] ids) {
        int count = 0;
        for (String id : ids) {
            int result = materialReceiveService.deleteOneMaterialReceive(id);
            //这边有bug
            if (result == 1) {
                count++;
            }
        }
        Tip tip;
        if(count == ids.length){
            tip = new Tip("200","物料收入成功",null);;
        } else{
            tip = new Tip("500","物料收入失败",null);
        }
        return tip;
    }

    //按materialId查找material
    @RequestMapping("search_materialReceive_by_receiveId")
    @ResponseBody
    public List<MaterialReceive> search_materialReceive_by_receiveId(String searchValue,int page,int rows) {
        int limit = rows;
        int offset = (page - 1) * rows;
        List<MaterialReceive> materialReceiveList = materialReceiveService.selectSearchPageMaterialReceiveByReceiveId(searchValue,limit,offset);
        return materialReceiveList;
    }

    //按materialType查找material
    @RequestMapping("search_materialReceive_by_materialId")
    @ResponseBody
    public List<MaterialReceive>search_materialReceive_by_materialId(String searchValue, int page, int rows) {
        int limit = rows;
        int offset = (page - 1) * rows;
        List<MaterialReceive> materialReceiveList = materialReceiveService.selectSearchPageMaterialReceiveByMaterialId(searchValue,limit,offset);
        return materialReceiveList;
    }



}
