package com.servicefeign.controller;

import com.servicefeign.ServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author smallTao.liu
 * @version V1.0
 * @description
 * @date 2018/7/10 16:26
 */
@RestController
public class FeignController {

    @Autowired
    ServiceClient serviceClient;

    @RequestMapping("/test")
    public String test(String str) {
        return serviceClient.test(str);
    }

}
