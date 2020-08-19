package com.codve.note.api.service;

import com.codve.note.api.model.UserDO;

/**
 * @author admin
 * @date 2020/8/17 19:09
 */
public interface UserService {

    int save(UserDO userDO);

    int deleteById(Long id);

    int update(UserDO userDO);

}
