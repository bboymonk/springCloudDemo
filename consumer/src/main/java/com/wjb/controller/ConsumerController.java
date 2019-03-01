package com.wjb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wjb on 2019/3/1.
 */
@RestController
public class ConsumerController {

    @Autowired
    private HelloRomte helloRomte;

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name){
        return helloRomte.hello(name);
    }

}
