package com.chigua.cloud.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CloudProviderApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(CloudProviderApplication.class);
    public static void main(String[] args) {
    	LOGGER.info("-----------------》》Provider启动");
        SpringApplication.run(CloudProviderApplication.class, args);
    }
}
