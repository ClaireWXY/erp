package com.cskaoyan.mapper;

import com.cskaoyan.bean.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {
    int insert(Product record);

    int insertSelective(Product record);
    //查询所有的商品
    List<Product> selectAllProducts();

    //根据产品编号查询所有的商品
    List<Product> selectProductById(@Param("id") String product_id);

    //根据产品名称查询产品
    List<Product> queryProductByName(@Param("name") String productName);

    //添加一条产品数据
    int insertProduct(Product product);

    //删除产品数据
    int deleteBatchProduct(@Param("ids") String[] ids);

    //修改一条产品信息
    int updateProductById(Product product);

    //根据id查询一个商品
    Product findOneProductById(@Param("id") String productId);

}