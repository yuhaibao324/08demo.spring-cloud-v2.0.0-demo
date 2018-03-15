package com.zbq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//加上@EnableConfigServer注解开启配置服务器的功能
@EnableConfigServer
@SpringBootApplication
@EnableEurekaClient
public class InstanceServiceConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstanceServiceConfigServerApplication.class, args);
	}
}
