package com.lsx.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 买家信息实体
 * @ClassName SellerInfo
 * @Author lanshanxiang
 * @Date 2019/10/14 21:17
 * @Version V1.0
 **/
@Data
@Entity
public class SellerInfo {
    @Id
    private String sellerId;

    private String username;

    private String password;

    private String openid;
}
