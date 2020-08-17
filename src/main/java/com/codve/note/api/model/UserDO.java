package com.codve.note.api.model;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author admin
 * @date 2020/8/17 21:02
 */
@Data
public class UserDO {

    private Long id;

    private String mobile;

    private String password;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
