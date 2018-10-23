package com.eurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author smallTao.liu
 * @version V1.0
 * @description
 * @date 2018/7/10 16:05
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("")
    public String test(String str) {
        return "Hello " + str + ", This is a test client!";
    }

}
