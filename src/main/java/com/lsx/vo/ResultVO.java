package com.lsx.vo;

import lombok.Data;

/**
 * http请求返回最外层的对象
 * @ClassName ResultVO
 * @Author lanshanxiang
 * @Date 2019/10/10 12:19
 * @Version V1.0
 **/
@Data
public class ResultVO<T> {
    //错误码
    private Integer code;
    //提示消息
    private String msg;
    //返回的具体内容
    private T data;
}
