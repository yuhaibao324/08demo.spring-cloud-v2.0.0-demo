#在配置文件中注明自己的服务注册中心的地址
#http://localhost:8762/hi?name=forezp
eureka:
  client:
    serviceUrl:
      defaultZone: http://localhost:8761/eureka/
server:
  port: 8762

spring:
  application:
#  需要指明spring.application.name,这个很重要，这在以后的服务与服务之间相互调用一般都是根据这个name
    name: service-hi



