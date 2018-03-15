package com.zbq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//通过注解@EnableEurekaClient 表明自己是一个eurekaclient
@EnableEurekaClient
public class InstanceEurekaclient1Application {

	public static void main(String[] args) {

		SpringApplication.run(InstanceEurekaclient1Application.class, args);
	}

}
