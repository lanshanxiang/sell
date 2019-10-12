package com.lsx.repository;


import com.lsx.pojo.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 订单详情页
 * @ClassName OrderDetailRepository
 * @Author lanshanxiang
 * @Date 2019年10月10日18:09:03
 * @Version v1.0
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {

    List<OrderDetail> findByOrderId(String orderId);
}
