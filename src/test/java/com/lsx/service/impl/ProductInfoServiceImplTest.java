package com.lsx.service.impl;

import com.lsx.pojo.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceImplTest {

    @Autowired
    private ProductInfoServiceImpl productInfoService;

    @Test
    public void findById() {
        ProductInfo byId = productInfoService.findOne("123456");
        System.out.println(byId);
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> upAll = productInfoService.findUpAll();
        upAll.forEach(x -> System.out.println(x));
    }

    @Test
    public void findAll() {
        PageRequest pageRequest = new PageRequest(0,2);
        Page<ProductInfo> all = productInfoService.findAll(pageRequest);
        all.forEach(x -> System.out.println(x));
    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("345678");
        productInfo.setProductName("排骨青菜粥");
        productInfo.setProductPrice(new BigDecimal(18));
        productInfo.setProductDescription("很好喝的粥");
        productInfo.setProductIcon("Http://****.jpg");
        productInfo.setProductStatus(1);
        productInfo.setProductStock(100);
        productInfo.setCategoryType(2);
        ProductInfo result = productInfoService.save(productInfo);
        if (result != null){
            System.out.println("插入成功");
        }else {
            System.out.println("插入失败");
        }
    }
}
