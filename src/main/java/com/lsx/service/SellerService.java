package com.lsx.service;

import com.lsx.pojo.SellerInfo;

/**
 * 卖家端service
 * @InterfaceName SellerService
 * @Author lanshanxiang
 * @Date 2019/10/14 21:35
 * @Version V1.0
 **/
public interface SellerService {
    /**
     * 通过openid查询卖家端信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
