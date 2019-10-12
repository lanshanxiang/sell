package com.lsx.enums;

import lombok.Getter;

/**
 * @ClassName OrderStatusEnum
 * @Author lanshanxiang
 * @Date 2019/10/10 17:25
 * @Version V1.0
 **/
@Getter
public enum OrderStatusEnum {

    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "已取消");

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
