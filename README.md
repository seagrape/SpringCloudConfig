# SpringCloudConfig
SpringCloudConfig + SpringCloudBus DEMO

[blog](http://blog.spring-cloud.io/blog/sc-config.html)

项目demo需要kafka服务，自行替换配置中的参数。

	spring.cloud.stream.kafka.binder.brokers=10.79.96.52:9092
	spring.cloud.stream.kafka.binder.zk-nodes=10.79.96.52:2182

## 快速开始

1、启动alan-config，配置中心服务端
2、启动alan-demo-config-client，配置中心客户端 
3、浏览器打开输出环境变量值 http://localhost:8080
4、观察环境变量 http://localhost:8080/env

## 更新单机配置

1、手动赋值curl -X POST http://localhost:8080/env -d spring.datasource.username=wsh
2、观察环境变量 http://localhost:8080/env
3、使配置生效 curl -X POST http://localhost:8080/refresh
4、浏览器打开输出环境变量值 http://localhost:8080

> 清除步骤1的方法 curl -X POST http://localhost:8080/env/reset

## 更新集群配置

1、修改配置文件，提交代码到github repo
2、观察环境变量 http://localhost:8080/env
2、更新集群 curl -X POST http://localhost:8888/bus/refresh


