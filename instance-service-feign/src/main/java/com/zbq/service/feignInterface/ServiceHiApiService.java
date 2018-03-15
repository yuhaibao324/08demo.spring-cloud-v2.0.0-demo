package com.zbq.service.feignInterface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhangboqing
 * @date 2018/3/12
 */
//定义一个feign接口，通过@ FeignClient（“服务名”），来指定调用哪个服务
@FeignClient(value = "service-hi",fallback = ServiceHiApiHystric.class)
@Component
public interface ServiceHiApiService {


    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
