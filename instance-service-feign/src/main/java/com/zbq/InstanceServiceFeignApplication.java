package com.zbq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


/**
 Feign是一个声明式的伪Http客户端，它使得写Http客户端变得更简单。
 使用Feign，只需要创建一个接口并注解。它具有可插拔的注解特性，可使用Feign 注解和JAX-RS注解。
 Feign支持可插拔的编码器和解码器。Feign默认集成了Ribbon，并和Eureka结合，默认实现了负载均衡的效果。

 简而言之：
 	1.Feign 采用的是基于接口的注解
 	2.Feign 整合了ribbon

  二、开启断路器
 	feign.hystrix.enabled=true
  三.加入Hystrix Dashboard (断路器：Hystrix 仪表盘)
 http://localhost:87645/hystrix 打开界面
 */

@SpringBootApplication
@EnableEurekaClient
//加上@EnableFeignClients注解开启Feign的功能
@EnableFeignClients
//@EnableHystrix注解开启Hystrix(断路器) feign通过配置开启feign.hystrix.enabled=true
//@EnableHystrix
//加入@EnableHystrixDashboard注解，开启hystrixDashboard
@EnableHystrixDashboard
@EnableCircuitBreaker
public class InstanceServiceFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstanceServiceFeignApplication.class, args);
	}

}
