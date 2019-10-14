package com.lsx.service;

import com.lsx.dto.OrderDTO;

/**
 * @InterfaceName BuyerService
 * @Author lanshanxiang
 * @Date 2019/10/13 16:49
 * @Version V1.0
 **/
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
