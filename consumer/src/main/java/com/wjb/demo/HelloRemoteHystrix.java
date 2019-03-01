package com.wjb.demo;

import com.wjb.controller.HelloRomte;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wjb on 2019/3/1.
 */
@Component
public class HelloRemoteHystrix implements HelloRomte {

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello"+name+",this is message request failed";
    }
}
