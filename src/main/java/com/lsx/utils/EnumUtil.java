package com.lsx.utils;

import com.lsx.enums.CodeEnum;

/**
 * @ClassName SellerOrderController
 * @Author lanshanxiang
 * @Date 2019/10/14 18:16
 * @Version V1.0
 **/
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each: enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
