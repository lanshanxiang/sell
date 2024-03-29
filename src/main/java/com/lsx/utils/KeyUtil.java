package com.lsx.utils;

import java.util.Random;

/**
 * 生成逐渐工具类
 * @InterfaceName KeyUtil
 * @Author lanshanxiang
 * @Date 2019/10/9 21:05
 * @Version V1.0
 **/
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式: 时间+随机数
     * @return
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
