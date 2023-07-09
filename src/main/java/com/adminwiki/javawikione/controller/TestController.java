package com.adminwiki.javawikione.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller // 返回页面
@RestController // 返回字符串
public class TestController {

//    @Value("${test.hello}")
    @Value("${test.hello: defaultConfigVal}") // : 之后的内容是默认值【冒号后有个空格，也是算默认值内容】
    private String testHello;

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
        return "hello world12367!" + testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name) {

        // http://127.0.0.1:8881/hello
        return "Hello World! Post app.running，" + name;
    }
}
