package com.example.demotest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author QianChao
 * @user 19205
 * @date 2024/2/20
 */
@Controller
@Slf4j
public class HelloController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        log.info("Hello ,world");
        return "Hello World Qianchao222";
    }
}
