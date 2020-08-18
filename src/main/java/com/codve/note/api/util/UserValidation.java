package com.codve.note.api.util;

import com.codve.note.api.exception.EX;
import com.codve.note.api.model.vo.UserVO;

import static com.codve.note.api.util.ExceptionUtil.exception;

/**
 * @author admin
 * @date 2020/8/18 15:19
 */
public class UserValidation {

    public static void passwordCheck(UserVO userVO) {
        if (userVO.getPassword().compareTo(userVO.getPasswordConfirm()) != 0) {
            exception(EX.E_1205);
        }
    }
}
