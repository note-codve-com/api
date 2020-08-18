package com.codve.note.api.aspect;

import com.codve.note.api.model.UserDO;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author admin
 * @date 2020/8/18 08:57
 */
@Aspect()
public class UserServiceAspect {

    private PasswordEncoder encoder;

    @Autowired
    public UserServiceAspect(PasswordEncoder encoder) {
        this.encoder = encoder;
    }

    @Pointcut("execution (* com.codve.note.api.service.UserService.save(com.codve.note.api.model.UserDO)) && args(userDO)")
    public void savePointcut(UserDO userDO) {

    }

    @Before(value = "savePointcut(userDO)", argNames = "userDO")
    public void beforeSave(UserDO userDO) {
        if (userDO != null && userDO.getPassword() != null) {
            userDO.setPassword(encoder.encode(userDO.getPassword()));
        }
    }
}
