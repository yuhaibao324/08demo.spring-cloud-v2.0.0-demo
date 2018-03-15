package com.zbq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableEurekaClient
//加上注解@EnableZipkinServer，开启ZipkinServer的功能
@EnableZipkinServer
public class InstanceServiceZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstanceServiceZipkinServerApplication.class, args);
	}
}
