package com.lsx.service;

import com.lsx.dto.CartDTO;
import com.lsx.pojo.ProductCategory;
import com.lsx.pojo.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

/**
 * 商品
 * @InterfaceName ProductInfoService
 * @Author lanshanxiang
 * @Date 2019/10/9 21:05
 * @Version V1.0
 **/
public interface ProductInfoService {

    //查询一条记录
    ProductInfo findOne(String productId);

    //查询所有在架商品列表
    List<ProductInfo> findUpAll();

    //查询所有
    Page<ProductInfo> findAll(Pageable pageable);

    //新增和更新都是此方法
    ProductInfo save(ProductInfo productInfo);

    //加库存
    void increaseStock(List<CartDTO> cartDTOList);

    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);

    //上架
    ProductInfo onSale(String productId);

    //下架
    ProductInfo offSale(String productId);


}
