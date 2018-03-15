package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
// 启动一个服务注册中心，只需要一个注解@EnableEurekaServer，这个注解需要在springboot工程的启动application类上加
@EnableEurekaServer
public class RegisterEurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterEurekaserverApplication.class, args);
	}
}
