package com.chigua.cloud.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 
 * @ClassName: CloudConsumerApplication
 * @Description: Spring boot 消费者实例
 * @author Mr.zhou
 * @date 2018年10月29日 下午12:25:47
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CloudConsumerApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(CloudConsumerApplication.class);
    public static void main(String[] args) {
    	LOGGER.info("-----------------》》consumer启动");
        SpringApplication.run(CloudConsumerApplication.class, args);
    }
}
