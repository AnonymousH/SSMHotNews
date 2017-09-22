package com.hotnews.ssm.util;


import com.hotnews.ssm.dto.ResponsTemplate;

/**
 * Created by Administrator on 2017/9/19.
 */
public class JsonUtil {


    public static <T> ResponsTemplate<T> getJsonResult(T data, int code, String message) {
        ResponsTemplate<T> result = new ResponsTemplate<T>();
        result.setCode(code);
        result.setData(data);
        result.setMsg(message);
        return result;
    }

}
