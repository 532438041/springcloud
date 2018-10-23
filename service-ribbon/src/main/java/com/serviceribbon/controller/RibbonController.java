package com.serviceribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author smallTao.liu
 * @version V1.0
 * @description
 * @date 2018/7/10 16:13
 */
@RestController
public class RibbonController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/test")
    public String test(String str) {
        String result = restTemplate.getForObject("http://DEV-CLIENT/test?str=" + str, String.class);
        return result;
    }

}
