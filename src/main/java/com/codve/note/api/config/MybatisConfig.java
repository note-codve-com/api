package com.codve.note.api.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author admin
 * @date 2020/8/17 20:23
 */
@Configuration
@MapperScan(basePackages = "com.codve.note.api.dao")
public class MybatisConfig {
}
