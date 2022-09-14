package com.fox.util;

import com.alibaba.fastjson.JSON;

public class JsonUtil {

    public static String toString(Object object) {
        return JSON.toJSONString(object);
    }

}
