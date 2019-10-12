package com.lsx.service.impl;

import com.lsx.pojo.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryServiceImplTest {
    @Autowired ProductCategoryServiceImpl productCategoryService;

    @Test
    public void findById() {
        ProductCategory productCategory = productCategoryService.findById(1);

    }

    @Test
    public void findAll() {
        List<ProductCategory> all = productCategoryService.findAll();
        /*for (ProductCategory a:all) {
            System.out.println(a);
        }*/
        all.forEach(x -> System.out.println(x
        ));
    }

    @Test
    public void findByCategoryTypeIn() {
    }

    @Test
    public void save() {
        ProductCategory productCategory = new ProductCategory("火爆榜",3);
        productCategory.setCategoryId(2);
        ProductCategory sav1 = productCategoryService.save(productCategory);
    }
}