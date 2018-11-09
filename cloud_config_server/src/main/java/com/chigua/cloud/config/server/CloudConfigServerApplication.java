package com.chigua.cloud.config.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 
 * @ClassName: CloudConfigServerApplication
 * @Description: Git 获取文件服务端工程
 * @author Mr.zhou
 * @date 2018年10月29日 下午12:23:58
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableConfigServer
public class CloudConfigServerApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(CloudConfigServerApplication.class);
    public static void main(String[] args) {
    	LOGGER.info("-----------------》》Spring cloud config server 启动");
        SpringApplication.run(CloudConfigServerApplication.class, args);
    }
}
