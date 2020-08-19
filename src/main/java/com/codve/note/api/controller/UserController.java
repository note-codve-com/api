package com.codve.note.api.controller;

import com.codve.note.api.model.UserDO;
import com.codve.note.api.model.vo.UserVO;
import com.codve.note.api.service.UserService;
import com.codve.note.api.util.CommonResult;
import com.codve.note.api.util.UserValidation;
import com.codve.note.api.util.convert.UserConvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;

/**
 * @author admin
 * @date 2020/8/17 22:26
 */
@RestController
@RequestMapping("/user")
@Validated
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/save")
    public CommonResult save(@RequestBody @Validated UserVO userVO) {
        UserValidation.passwordCheck(userVO);
        UserDO userDO = UserConvert.convert(userVO);
        userService.save(userDO);
        return CommonResult.success();
    }

    @GetMapping("/delete/{id}")
    public CommonResult delete(@PathVariable @Valid @Min(value = 1) Long id) {
        userService.deleteById(id);
        return CommonResult.success();
    }
}
