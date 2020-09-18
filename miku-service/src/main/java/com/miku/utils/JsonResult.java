package com.miku.utils;

import lombok.Data;

/**
 * @author: Utopiamiku
 * @date: 2020/9/16 19:42
 * @description:
 */
@Data
public class JsonResult<T> {
    private String msg;
    private T obj;
    private Integer stateCode;

    public JsonResult(T obj) {
        this.obj = obj;
    }

    public JsonResult(String msg, T obj, Integer stateCode) {
        this.msg = msg;
        this.obj = obj;
        this.stateCode = stateCode;
    }

    public JsonResult() {
    }
}
