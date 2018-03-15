package com.zbq.controller;

import com.zbq.service.feignInterface.ServiceHiApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangboqing
 * @date 2018/3/12
 */
@RestController
public class HiController {

    @Autowired
    private ServiceHiApiService serviceHiApiService;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){

        return serviceHiApiService.sayHiFromClientOne(name);
    }

}
