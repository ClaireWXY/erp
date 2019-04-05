package com.cskaoyan.controller;

import com.cskaoyan.bean.MaterialConsume;
import com.cskaoyan.bean.MaterialReceive;
import com.cskaoyan.bean.Tip;
import com.cskaoyan.service.MaterialConsumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("materialConsume")
public class MaterialConsumeController {

    @Autowired
    MaterialConsumeService materialConsumeService;

    @RequestMapping("find")
    public String find() {
        return "materialConsume_list";
    }

    //查找materialconsume
    @RequestMapping("list")
    @ResponseBody
    public List<MaterialConsume> list(int page, int rows) {
        int limit = rows;
        int offset = (page - 1) * rows;
        List<MaterialConsume> materialConsumeList = materialConsumeService.selectPageMaterialConsume(limit, offset);
        return materialConsumeList;
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
        return "materialConsume_add";
    }

    //添加material操作
    @RequestMapping("insert")
    @ResponseBody
    public Tip insert(MaterialConsume materialConsume) {
        int result = materialConsumeService.insertOneMaterialConsume(materialConsume);
        Tip tip;
        if(result==1){
            tip = new Tip("200","物料消费添加成功",null);
        } else{
            tip = new Tip("500","物料消费添加失败",null);
        }
        return tip;
    }

    //更新界面
    @RequestMapping("edit")
    public String edit(){
        return "materialConsume_edit";
    }

    @RequestMapping("update_all")
    @ResponseBody
    public Tip update_all(MaterialConsume materialConsume) {
        int result = materialConsumeService.updateMaterialConsume(materialConsume);
        Tip tip;
        if(result==1){
            tip = new Tip("200","物料收入修改成功",null);;
        } else{
            tip = new Tip("500","物料收入修改失败",null);
        }
        return tip;
    }


    @RequestMapping("update_note")
    @ResponseBody
    public Tip update_note(MaterialConsume materialConsume){
        int result = materialConsumeService.updateMaterialConsumeNoteById(materialConsume);
        Tip tip;
        if(result==1){
            tip = new Tip("200","物料消费修改成功",null);;
        } else{
            tip = new Tip("500","物料消费修改失败",null);
        }
        return tip;
    }


    @RequestMapping("delete_batch")
    @ResponseBody
    public Tip delete_batch(@RequestParam("ids") String[] ids) {
        int count = 0;
        for (String id : ids) {
            int result = materialConsumeService.deleteOneMaterialConsume(id);
            //这边有bug
            if (result == 1) {
                count++;
            }
        }
        Tip tip;
        if(count == ids.length){
            tip = new Tip("200","物料消费删除成功",null);;
        } else{
            tip = new Tip("500","物料消费删除失败",null);
        }
        return tip;
    }

    //按consumeId查找
    @RequestMapping("search_materialConsume_by_consumeId")
    @ResponseBody
    public List<MaterialReceive> search_materialConsume_by_consumeId(String searchValue,int page,int rows) {
        int limit = rows;
        int offset = (page - 1) * rows;
        List<MaterialReceive> materialReceiveList = materialConsumeService.selectSearchPageMaterialConsumeByConsumeId(searchValue,limit,offset);
        return materialReceiveList;
    }

    //按materialId查找material
    @RequestMapping("search_materialConsume_by_materialId")
    @ResponseBody
    public List<MaterialReceive>search_materialConsume_by_materialId(String searchValue, int page, int rows) {
        int limit = rows;
        int offset = (page - 1) * rows;
        List<MaterialReceive> materialReceiveList = materialConsumeService.selectSearchPageMaterialConsumeByMaterialId(searchValue,limit,offset);
        return materialReceiveList;
    }

    @RequestMapping("search_materialConsume_by_workId")
    @ResponseBody
    public List<MaterialReceive>search_materialConsume_by_workId(String searchValue, int page, int rows) {
        int limit = rows;
        int offset = (page - 1) * rows;
        List<MaterialReceive> materialReceiveList = materialConsumeService.selectSearchPageMaterialConsumeByWorkId(searchValue,limit,offset);
        return materialReceiveList;
    }


}
