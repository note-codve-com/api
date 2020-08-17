package com.codve.note.api.util;

import com.codve.note.api.exception.CommonException;
import com.codve.note.api.exception.EX;

/**
 * @author admin
 * @date 2020/8/17 22:20
 */
public class ExceptionUtil {

    public static void exception(EX ex) {
        throw new CommonException(ex.getCode(), ex.getMsg());
    }
}
