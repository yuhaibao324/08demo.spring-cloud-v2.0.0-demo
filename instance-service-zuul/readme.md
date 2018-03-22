#   需要依次启动项目  http://localhost:8769/api-a/hi?name=forezp
#   http://localhost:8769/api-a/hi?name=forezp&token=22
eureka:
  client:
    serviceUrl:
      defaultZone: http://localhost:8761/eureka/
server:
  port: 8769
spring:
  application:
    name: service-zuul
#  以/api-a/ 开头的请求都转发给service-ribbon服务；以/api-b/开头的请求都转发给service-feign服务；
zuul:
  routes:
    api-a:
      path: /api-a/**
      serviceId: service-ribbon
    api-b:
      path: /api-b/**
      serviceId: service-feign

#通过引入弹簧云起动基普金依赖和设置spring.zipkin.base的URL
spring:
  zipkin:
      base-url: http://localhost:9411
      
      
      
#### 微服务网关可以解决如下问题
````
如果客户端直接和微服务进行通信，会存在一下问题

# 客户端会多次请求不同微服务，增加客户端的复杂性

# 存在跨域请求，在一定场景下处理相对复杂

# 认证复杂，每一个服务都需要独立认证

# 难以重构，随着项目的迭代，可能需要重新划分微服务，如果客户端直接和微服务通信，那么重构会难以实施

# 某些微服务可能使用了其他协议，直接访问有一定困难

````