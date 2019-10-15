package com.lsx.constant;


/**
 * redis常量
 * @ClassName RedisConstant
 * @Author lanshanxiang
 * @Date 2019/10/15 11:30
 * @Version V1.0
 **/
public interface RedisConstant {

    String TOKEN_PREFIX = "token_%s";

    Integer EXPIRE = 7200; //2小时
}
