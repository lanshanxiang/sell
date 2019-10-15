package com.lsx.enums;

import lombok.Getter;

/**
 * @ClassName PayStatusEnum
 * @Author lanshanxiang
 * @Date 2019/10/10 17:38
 * @Version V1.0
 **/
@Getter
public enum PayStatusEnum implements CodeEnum{
    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功");

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
