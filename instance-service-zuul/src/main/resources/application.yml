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