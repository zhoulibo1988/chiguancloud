package com.chigua.cloud.config.client;

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

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigClientApplication.class, args);
    }
}
