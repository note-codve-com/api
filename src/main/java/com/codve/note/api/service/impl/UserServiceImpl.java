package com.codve.note.api.service.impl;

import com.codve.note.api.dao.UserMapper;
import com.codve.note.api.exception.EX;
import com.codve.note.api.model.UserDO;
import com.codve.note.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.codve.note.api.util.ExceptionUtil.exception;

/**
 * @author admin
 * @date 2020/8/17 19:09
 */
@Service
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public int save(UserDO userDO) {
        int result = userMapper.save(userDO);
        if (result != 1) {
            exception(EX.E_1101);
        }
        return result;
    }
}
