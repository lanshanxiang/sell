package com.lsx.enums;

import lombok.Getter;

/**
 * @ClassName ProductStatusEnum
 * @Author lanshanxiang
 * @Date 2019/10/10 11:16
 * @Version V1.0
 **/
@Getter
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架");

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
