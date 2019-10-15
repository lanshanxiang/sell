package com.lsx.service.impl;

import com.lsx.pojo.SellerInfo;
import com.lsx.repository.SellerInfoRepository;
import com.lsx.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName SellerServiceImpl
 * @Author lanshanxiang
 * @Date 2019/10/14 21:37
 * @Version V1.0
 **/
@Service
public class SellerServiceImpl implements SellerService {
    @Autowired
    private SellerInfoRepository repository;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return repository.findByOpenid(openid);
    }
}
