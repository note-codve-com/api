package com.codve.note.api.exception;

/**
 * @author admin
 * @date 2020/8/17 22:21
 */
public class CommonException extends RuntimeException{

    private int code;

    public CommonException(int code, String message) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
