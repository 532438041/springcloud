package com.servicefeign;

import org.springframework.stereotype.Component;

/**
 * @author smallTao.liu
 * @version V1.0
 * @description
 * @date 2018/7/10 17:12
 */
@Component
public class ServiceClientImpl implements ServiceClient {

    @Override
    public String test(String str) {
        return str + " error!";
    }
}
