package com.cskaoyan.service;

import com.cskaoyan.bean.Product;

import java.util.List;

public interface ProductService {

    //查询所有的产品
    List<Product> findAllProducts();

    //根据产品编号查询产品
    List<Product> findProductById(String id);

    //根据产品名称查询产品
    List<Product> findProductByName(String name);

    //添加一条产品数据
    boolean insertProduct(Product product);

    //删除产品
    boolean deleteBatchProduct(String[] ids);

    //修改产品信息
    boolean updateProductById(Product product);
}
