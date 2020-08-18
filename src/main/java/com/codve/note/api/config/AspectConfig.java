package com.codve.note.api.config;

import com.codve.note.api.aspect.UserServiceAspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author admin
 * @date 2020/8/18 09:10
 */
@Configuration
@EnableAspectJAutoProxy
public class AspectConfig {

    @Bean
    @Autowired
    public UserServiceAspect userServiceAspect(PasswordEncoder encoder) {
        return new UserServiceAspect(encoder);
    }
}
