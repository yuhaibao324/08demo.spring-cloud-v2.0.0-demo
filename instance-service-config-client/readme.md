# http://localhost:8881/hi
# http://localhost:8881/actuator/bus-refresh

spring.application.name=config-client
spring.cloud.config.label=master
spring.cloud.config.profile=dev
#spring.cloud.config.uri= http://localhost:8888/
server.port=8881

#spring.cloud.config.label 指明远程仓库的分支

#spring.cloud.config.profile
#dev开发环境配置文件
#test测试环境
#pro正式环境

#spring.cloud.config.uri= http://localhost:8888/ 指明配置服务中心的网址。

eureka.client.serviceUrl.defaultZone=http://localhost:8761/eureka/
spring.cloud.config.discovery.enabled=true
spring.cloud.config.discovery.serviceId=config-server

#spring.cloud.config.discovery.enabled是从配置中心读取文件。
#spring.cloud.config.discovery.serviceId配置中心的servieId，即服务名。
#时发现，在读取配置文件不再写的IP地址，而是服务名，这时如果配置服务部署多份，通过负载均衡，从而高可用。


spring.rabbitmq.host=140.143.229.63
spring.rabbitmq.port=5672
spring.rabbitmq.username=zbq
spring.rabbitmq.password=zbq
spring.rabbitmq.publisher-confirms=true
spring.rabbitmq.virtual-host=/

#升级2.0以后端点全部默认隐藏的需要在配置文件里加上
#当然安全起见不一定全部暴露，可以[ “健康”，”映射”， “公交刷新”]这样指定暴露哪些端点
# 记得在对应获取属性的类上加 @RefreshScope注解 然后修改配置后 调用 http://localhost:8881/actuator/bus-refresh 或 http://localhost:8881/actuator/bus-refresh?destination=config-client 刷新就可以了
management.endpoints.web.exposure.include = *
#management.endpoints.web.base-path来配置这个“/ actuator