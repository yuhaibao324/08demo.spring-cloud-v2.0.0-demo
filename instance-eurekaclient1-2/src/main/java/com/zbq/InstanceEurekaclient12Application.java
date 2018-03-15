package com.zbq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//通过注解@EnableEurekaClient 表明自己是一个eurekaclient
@EnableEurekaClient
public class InstanceEurekaclient12Application {

	public static void main(String[] args) {
		SpringApplication.run(InstanceEurekaclient12Application.class, args);
	}
}
