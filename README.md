# -- ChiGuaTeam 官网
	|--提供各类技术文档，官方博客，技术服务，承接开发项目等
[ChiGuaTeam](https://www.chiguateam.com/)
![ChiGuaTeam](https://qny.chiguateam.com/image/logo.png "ChiGuaTeam")
	
		
# -- chiguancloud工程说明
	|------------------------------------------------------------------|
	|---[chiguancloud]	父级
	|------[cloud_config_client]	配置中心类客户端
	|------[cloud_config_server]	配置中心服务端
	|------[cloud_consumer]		消费者
	|------[cloud_eureka]			注册中心
	|------[cloud_provider]		服务提供者
	|------[cloud_common]			公共服务类
	|------[cloud_admin_server]	spring boot admin 管理和监控Spring Boot程序
	|------[cloud_zipkin_server]	服务跟踪服务
	|------------------------------------------------------------------|

# -- 各个工程说明
	|------------------------------------------------------------------|
	|--cloud_config_client：配置中心如何从远程git读取配置文件，集成了Spring cloud config, Spring cloud bus,RabbitMQ,GitHub
	|--cloud_config_server：配置中心服务端主要是获取文件功能，供cloud_config_client进行读取远程配置文件
	|--cloud_consumer：消费者实例，集成Feign，进行注册中心获取服务，集成Hystrix，进行熔断机制
	|--cloud_eureka：注册中心，主要为各个功能提供注册服务；供各个服务之间的相互调用
	|--cloud_provider：服务提供者，这里主要给消费者提供消费服务，集成Feign
	|--cloud_common：提供了统一返回JSON数据格式
	|--cloud_admin_server：Spring Boot Admin用于管理和监控Spring Boot程序，Spring Boot Admin 作为 Server 端，其他的要被监控的应用作为 Client 端
	|					
	|------------------------------------------------------------------|
	
# -- 所用技术组件
	|------------------------------------------------------------------|
	|--Spring boot
	|--Spring cloud
	|--Spring colud eureka
	|--Spring cloud config
	|--Spring cloud bus
	|--RabbitMQ
	|--Spring cloud feign
	|--Spring cloud Hystrix
	|--Spring boot admin
	|------------------------------------------------------------------|

# --	 Spring cloud	 组件版本
	|------------------------------------------------------------------|
	|--spring boot:	2.0.6.RELEASE
	|--spring-cloud:	Finchley.SR2
	|--spring boot admin:	2.0.4
	|--RabbitMQ:	rabbitmq-server-3.6.6-1.el6.noarch.rpm
	|--erlang:	erlang-19.0.4-1.el7.centos.x86_64.rpm
	|------------------------------------------------------------------|
	
# --	 chiguacloud	各个服务组件启动顺序
	|------------------------------------------------------------------|
	|	*1：cloud_eureka
	|	*2：cloud_config_server
	|	*3：cloud_config_client
	|	*4：这里启动自己的业务工程：比如业务服务提供者，消费者
	|	*5：最后启动：cloud_admin_server,服务监控服务
	|
	|
	|------------------------------------------------------------------|

# --	采坑注意事项
	|------------------------------------------------------------------|
	|	*1：在配置中心搭建时，我们集成了Spring cloud bus 此服务，此服务我使用git
	|		与rabbit来配合合作时，当我们改变配置文件时候，需要主动的访问url:
	|		http://localhost:9004/actuator/bus-refresh，客户端才能生效改动的文件，
	|		这样是不可取的；具体可以参考此文章https://blog.csdn.net/yanpenglei/article/details/78891620，
	|		会有所帮助
	|
	|
	|
	|
	| ----------------------------------------------------------------|	

# --	进度图
![Image text](https://raw.githubusercontent.com/zhoulibo1988/config-repo/master/config/chiguacloud.png)
	
	
	