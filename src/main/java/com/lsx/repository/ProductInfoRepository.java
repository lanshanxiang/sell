package com.lsx.repository;

import com.lsx.pojo.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 买家商品
 * @ClassName OrderMasterRepository
 * @Author lanshanxiang
 * @Date 2019年10月9日 17:49:42
 * @Version v1.0
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {

    //通过商品状态查询商品是否上架
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
