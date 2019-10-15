package com.lsx.repository;

import com.lsx.pojo.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 卖家信息dao
 * @InterfaceName SellerInfoRepository
 * @Author lanshanxiang
 * @Date 2019/10/14 21:19
 * @Version V1.0
 **/
public interface SellerInfoRepository extends JpaRepository<SellerInfo, String> {
    SellerInfo findByOpenid(String openid);
}
