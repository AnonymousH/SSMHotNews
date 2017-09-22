package com.hotnews.ssm.util;

import com.google.gson.Gson;
import com.google.gson.JsonNull;
import com.hotnews.ssm.dto.ResponsTemplate;

/**
 * Created by Administrator on 2017/9/19.
 */
public class JsonUtil {

    private static Gson gson=new Gson();


    /**
     * @MethodName : toJson
     * @Description : 将对象转为JSON串，此方法能够满足大部分需求
     * @param src
     *            :将要被转化的对象
     * @return :转化后的JSON串
     */
    public static String toJson(Object src) {
        if (src == null) {
            return gson.toJson(JsonNull.INSTANCE);
        }
        return gson.toJson(src);
    }


    public static <T> ResponsTemplate<T> getJsonResult(T data, int code, String message) {
        ResponsTemplate<T> result = new ResponsTemplate<T>();
        result.setCode(code);
        result.setData(data);
        result.setMsg(message);
        return result;
    }

}
