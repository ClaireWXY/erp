package com.cskaoyan.controller;

import com.cskaoyan.bean.Product;
import com.cskaoyan.bean.Tip;
import com.cskaoyan.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("product")
public class ProductController {

    @Autowired
    ProductService productService;

    //处理*_judge
    @RequestMapping("*_judge")
    @ResponseBody
    public String judge(){
        return "";
    }

    //查询所有的商品
    @RequestMapping("find")
    public String find(){
        return "product_list";
    }

    @RequestMapping("list")
    @ResponseBody
    public List<Product> finAllProducts(){
        List<Product> productList = productService.findAllProducts();
        return productList;
    }

    //根据产品编号，查询单个商品（查询不显示，有问题）
    @RequestMapping("search_product_by_productId")
    @ResponseBody
    public List<Product> findProductById(String id){
        List<Product> productList = productService.findProductById(id);
        return productList;
    }

    //根据产品产品的名称，搜索产品（查询不显示，有问题）
    @RequestMapping("search_product_by_productName")
    @ResponseBody
    public List<Product> findProductByName(String name){
        List<Product> productList = productService.findProductByName(name);
        return productList;
    }

    //添加一个商品
    @RequestMapping("add")
    public String add(){
        return "product_add";
    }

    @RequestMapping("insert")
    @ResponseBody
    public Tip insertProduct(Product product){
        boolean b  = productService.insertProduct(product);
        if (b){
            return new Tip("200","增加产品成功。",null);
        }
        return new Tip("0","添加失败。",null);
    }

    //批量删除（可以加事务）
    @RequestMapping("delete_batch")
    @ResponseBody
    public Tip deleteBatchProduct(String[] ids){
        boolean b = productService.deleteBatchProduct(ids);
        if(b){
            return new Tip("200","删除产品成功",null);
        }
        return new Tip("0","删除失败",null);
    }

    //修改产品数据
    //根据键，修改一条客户数据
    @RequestMapping("edit")
    public String edit(){
        return "product_edit";
    }

    @RequestMapping("update_all")
    @ResponseBody
    public Tip updateProduct(Product product){
        boolean b = productService.updateProductById(product);
        if (b){
            return new Tip("200","修改客户成功。",null);
        }
        return new Tip("0","修改失败。",null);
    }
}
