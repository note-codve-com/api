package com.codve.note.api.controller;

import com.codve.note.api.model.UserDO;
import com.codve.note.api.service.UserService;
import com.codve.note.api.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author admin
 * @date 2020/8/17 22:26
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/save")
    public CommonResult save() {
        UserDO userDO = new UserDO();
        userDO.setMobile("18519341520");
        userDO.setPassword("123456");
        userService.save(userDO);
        return CommonResult.success();
    }
}
