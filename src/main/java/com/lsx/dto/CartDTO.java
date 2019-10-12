package com.lsx.dto;

import lombok.Data;

/**
 * @ClassName CartDTO
 * @Author lanshanxiang
 * @Date 2019/10/11 18:18
 * @Version V1.0
 **/
@Data
public class CartDTO {

    /** 商品Id. */
    private String productId;

    /** 数量. */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
