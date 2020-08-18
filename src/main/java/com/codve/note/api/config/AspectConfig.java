package com.codve.note.api.config;

import com.codve.note.api.aspect.UserServiceAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author admin
 * @date 2020/8/18 09:10
 */
@Configuration
@EnableAspectJAutoProxy
public class AspectConfig {

    @Bean
    public UserServiceAspect userServiceAspect() {
        return new UserServiceAspect();
    }
}
