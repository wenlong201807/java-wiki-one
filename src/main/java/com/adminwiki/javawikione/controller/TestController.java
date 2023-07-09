package com.adminwiki.javawikione.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller // 返回页面
@RestController // 返回字符串
public class TestController {
    /**
     * method: get post put delete
     * @return
     *
     *  @RequestMapping 支持restful 风格
     * */
//    @GetMapping("/hello")
//    @PostMapping
//    @PutMapping
//    @DeleteMapping
//    @RequestMapping("/hello")
//    @RequestMapping(value = "/hello/1", method = RequestMethod.GET)
//    @RequestMapping(value = "/hello/1", method = RequestMethod.DELETE)
    @GetMapping("/hello")
    public String hello() {

        // http://127.0.0.1:8881/hello
        return "hello world!";
    }
}
