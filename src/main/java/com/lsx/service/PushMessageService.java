package com.lsx.service;

import com.lsx.dto.OrderDTO;
/**
 * 推送消息
 * @InterfaceName PushMessageService
 * @Author lanshanxiang
 * @Date 2019/10/15 13:09
 * @Version V1.0
 **/
public interface PushMessageService {
    /**
     * 订单状态变更消息
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}
