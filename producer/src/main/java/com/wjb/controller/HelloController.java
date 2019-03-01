package com.wjb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wjb on 2019/2/28.
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(String name){
        return "hello"+name+"this is producer";
    }

}
