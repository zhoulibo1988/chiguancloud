# -- chiguancloud工程说明
	|---[chiguancloud]	父级
	|------[cloud_config_client]	配置中心类客户端
	|------[cloud_config_server]	配置中心服务端
	|------[cloud_consumer]		消费者
	|------[cloud_eureka]			注册中心
	|------[cloud_provider]		服务提供者
	|------[cloud_common]			公共服务类

# -- 各个工程说明
	|--cloud_config_client：配置中心如何从远程git读取配置文件，集成了Spring cloud config, Spring cloud bus,RabbitMQ,GitHub
	|--cloud_config_server：配置中心服务端主要是获取文件功能，供cloud_config_client进行读取远程配置文件
	|--cloud_consumer：消费者实例，集成Feign，进行注册中心获取服务，集成Hystrix，进行熔断机制
	|--cloud_eureka：注册中心，主要为各个功能提供注册服务；供各个服务之间的相互调用
	|--cloud_provider：服务提供者，这里主要给消费者提供消费服务，集成Feign
	|--cloud_common：提供了统一返回JSON数据格式
	
# -- 所用技术组件
	|--Spring boot
	|--Spring cloud
	|--Spring colud eureka
	|--Spring cloud config
	|--Spring cloud bus
	|--RabbitMQ
	|--Spring cloud feign
	|--Spring cloud Hystrix
	
	
	