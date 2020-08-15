package com.codve.note.api.controller;

import com.codve.note.api.util.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author admin
 * @date 2020/8/14 23:18
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public CommonResult hello() {
        return CommonResult.success();
    }

    @GetMapping("/default-error")
    public CommonResult error() {
        return CommonResult.error();
    }

    @GetMapping("/custom-error")
    public CommonResult customError() {
        return CommonResult.error(123, "你搞错啦");
    }
}
