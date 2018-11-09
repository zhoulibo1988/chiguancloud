package com.chigua.cloud.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * @ClassName: CloudEurekaApplication
 * @Description: 注册中心 Eureka server
 * @author Mr.zhou
 * @date 2018年10月29日 下午12:26:26
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(CloudEurekaApplication.class);
    public static void main(String[] args) {
    	LOGGER.info("-----------------》》Eureka启动");
        SpringApplication.run(CloudEurekaApplication.class, args);
    }
}
