package com.zbq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**1.服务调用 RestTemplate+Ribbon去消费服务 */
/**2.断路器*/
//Feign中使用断路器在D版本的Spring Cloud中，它没有默认打开。需要在配置文件中配置打开它，在配置文件加以下代码
//feign.hystrix.enabled=true
@SpringBootApplication
@EnableEurekaClient
//通过@EnableDiscoveryClient向服务中心注册
//@EnableDiscoveryClient
@EnableHystrix
//http://localhost:8764/hystrix
@EnableHystrixDashboard
public class InstanceServiceRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstanceServiceRibbonApplication.class, args);
	}



//	向程序的ioc注入一个bean: restTemplate;并通过@LoadBalanced注解表明这个restRemplate开启负载均衡的功能
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}


}
