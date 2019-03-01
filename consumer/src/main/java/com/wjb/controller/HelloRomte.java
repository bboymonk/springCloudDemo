package com.wjb.controller;

import com.wjb.demo.HelloRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wjb on 2019/3/1.
 * Feign是一个声明式Web Service客户端。使用Feign能让编写Web Service客户端更加简单,
 * 它的使用方法是定义一个接口，然后在上面添加注解，同时也支持JAX-RS标准的注解。
 * Feign也支持可拔插式的编码器和解码器。Spring Cloud对Feign进行了封装，
 * 使其支持了Spring MVC标准注解和HttpMessageConverters。
 * Feign可以与Eureka和Ribbon组合使用以支持负载均衡。
 *
 * 添加指定fallback类，在服务熔断的时候返回fallback类中的内容
 */
@Component
@FeignClient(name= "producer",fallback = HelloRemoteHystrix.class)
public interface HelloRomte {
    @RequestMapping(value = "/hello")
     String hello(@RequestParam(value = "name") String name);
}
