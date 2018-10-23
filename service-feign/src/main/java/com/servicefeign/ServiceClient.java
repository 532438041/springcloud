package com.servicefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author smallTao.liu
 * @version V1.0
 * @description
 * @date 2018/7/10 16:28
 */
@FeignClient(value = "DEV-CLIENT", fallback = ServiceClientImpl.class)
public interface ServiceClient {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    String test(@RequestParam(value="str") String str);

}
