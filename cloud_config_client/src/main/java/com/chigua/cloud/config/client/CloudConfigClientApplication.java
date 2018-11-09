package com.chigua.cloud.config.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 
 * @ClassName: CloudConfigClientApplication
 * @Description: Spring cloud config client：统一提供git配置文件的信息工程
 * @author Mr.zhou
 * @date 2018年10月29日 下午12:11:28
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CloudConfigClientApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(CloudConfigClientApplication.class);
    public static void main(String[] args) {
    	LOGGER.info("-----------------》》Spring cloud config 配置客户端启动");
        SpringApplication.run(CloudConfigClientApplication.class, args);
    }
}
