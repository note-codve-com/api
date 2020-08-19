package com.codve.note.api.dao;

import com.codve.note.api.model.UserDO;
import org.springframework.stereotype.Repository;

/**
 * @author admin
 * @date 2020/8/17 19:09
 */
@Repository
public interface UserMapper {

    int save(UserDO userDO);

    int deleteById(Long id);

    int update(UserDO userDO);
}
