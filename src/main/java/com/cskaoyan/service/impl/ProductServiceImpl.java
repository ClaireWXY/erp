package com.cskaoyan.service.impl;

import com.cskaoyan.bean.Product;
import com.cskaoyan.mapper.ProductMapper;
import com.cskaoyan.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    //查询所有的商品
    @Override
    public List<Product> findAllProducts() {
        List<Product> productList = productMapper.selectAllProducts();
        return productList;
    }

    //根据产品编号，查询单个产品
    @Override
    public List<Product> findProductById(String id) {
        List<Product> productList = productMapper.selectProductById(id);
        return productList;
    }

    //根据产品名称查询产品
    @Override
    public List<Product> findProductByName(String name) {
        List<Product> productList = productMapper.queryProductByName(name);
        return productList;
    }

    //插入一条产品数据
    @Override
    public boolean insertProduct(Product product) {
        int b = productMapper.insertProduct(product);
        return b==1 ;
    }

    //删除产品数据
    @Override
    public boolean deleteBatchProduct(String[] ids) {
        int delete = productMapper.deleteBatchProduct(ids);
        return delete == ids.length;
    }

    @Override
    public boolean updateProductById(Product product) {
        int update = productMapper.updateProductById(product);
        return update==1;
    }

    //根据id查询一个商品
    @Override
    public Product findOneProductById(String productId) {
        Product product = productMapper.findOneProductById(productId);
        return product;
    }
}
