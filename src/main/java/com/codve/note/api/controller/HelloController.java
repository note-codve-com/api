package com.codve.note.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author admin
 * @date 2020/8/14 23:18
 */
@RestController
public class HelloController {

    @GetMapping(name = "/hello", produces = "application/json")
    public String hello() {
        return "hello, world";
    }
}
