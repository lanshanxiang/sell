package com.lsx.exception;

import com.lsx.enums.ResultEnum;

/**
 * @ClassName SellException
 * @Author lanshanxiang
 * @Date 2019/10/10 18:39
 * @Version V1.0
 **/
public class SellException extends RuntimeException{
    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
