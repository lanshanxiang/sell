package com.lsx.service;

import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.model.RefundResponse;
import com.lsx.dto.OrderDTO;

/**
 * @InterfaceName PayService
 * @Author lanshanxiang
 * @Date 2019/10/14 15:11
 * @Version V1.0
 **/
public interface PayService {

    PayResponse create(OrderDTO orderDTO);

    PayResponse notify(String notifyData);

    RefundResponse refund(OrderDTO orderDTO);
}
