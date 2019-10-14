package com.lsx.service;

import com.lsx.pojo.ProductCategory;

import java.util.List;
import java.util.Optional;

/**
 * 类目 service 接口
 * @ClassName ProductCategoryService
 * @Author lanshanxiang
 * @Date 2019年10月9日 17:50:56
 * @Version v1.0
 */
public interface ProductCategoryService {

    //查询一条记录
    ProductCategory findOne(Integer categoryId);

    //查询所有
    List<ProductCategory> findAll();

    //通过类目编号查类目
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    //新增和更新都是此方法
    ProductCategory save(ProductCategory productCategory);
}
