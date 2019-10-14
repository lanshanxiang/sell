package com.lsx.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @ClassName SellerOrderController
 * @Author lanshanxiang
 * @Date 2019/10/14 18:16
 * @Version V1.0
 **/
public class JsonUtil {

    public static String toJson(Object object) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }
}
