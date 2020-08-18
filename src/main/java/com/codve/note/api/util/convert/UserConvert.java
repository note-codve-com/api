package com.codve.note.api.util.convert;

import com.codve.note.api.model.UserDO;
import com.codve.note.api.model.vo.UserVO;
import org.springframework.beans.BeanUtils;

/**
 * @author admin
 * @date 2020/8/18 14:26
 */
public class UserConvert {

    public static UserDO convert(UserVO userVO) {
        UserDO userDO = new UserDO();
        BeanUtils.copyProperties(userVO, userDO);
        return userDO;
    }
}
