package com.codve.note.api.util;

import com.codve.note.api.exception.EX;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @author admin
 * @date 2020/8/14 23:47
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommonResult<T> {

    private int code;

    private String msg;

    private T data;

    public static CommonResult success() {
        return newInstance(0, "success");
    }

    public static CommonResult error(EX ex) {
        return newInstance(ex.getCode(), ex.getMsg());
    }

    public static CommonResult error(int code, String msg) {
        return newInstance(code, msg);
    }

    private static CommonResult newInstance(int code, String msg) {
        CommonResult result = new CommonResult();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
