package com.zbq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/*
http://localhost:8888/foo/dev
证明配置服务中心可以从远程程序获取配置信息。

http请求地址和资源文件映射如下:

/{application}/{profile}[/{label}]
/{application}-{profile}.yml
/{label}/{application}-{profile}.yml
/{application}-{profile}.properties
/{label}/{application}-{profile}.properties
*/

@SpringBootApplication
@EnableEurekaClient
public class InstanceServiceConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstanceServiceConfigClientApplication.class, args);
	}
}
