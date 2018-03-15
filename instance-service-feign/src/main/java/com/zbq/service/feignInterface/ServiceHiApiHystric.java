package com.zbq.service.feignInterface;

import org.springframework.stereotype.Component;

/**
 * @author zhangboqing
 * @date 2018/3/12
 */
@Component
public class ServiceHiApiHystric implements ServiceHiApiService {


    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }

}
