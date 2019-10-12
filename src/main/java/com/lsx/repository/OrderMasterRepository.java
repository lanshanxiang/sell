package com.lsx.repository;

import com.lsx.pojo.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 订单页面
 * @ClassName OrderMasterRepository
 * @Author lanshanxiang
 * @Date 2019年10月10日 18:09:35
 * @Version v1.0
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {

    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);
}
