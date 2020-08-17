package com.codve.note.api.exception;

/**
 * @author admin
 * @date 2020/8/17 22:16
 */
public enum EX {
    E_0(0, "success"),

    E_999(999, "未知错误"),
    E_1000(1000, "请求错误"),

    E_1101(1101, "添加失败"),
    ;

    private int code;

    private String msg;

    EX(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
