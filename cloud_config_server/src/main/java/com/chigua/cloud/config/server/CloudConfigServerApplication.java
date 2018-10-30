package com.chigua.cloud.config.server;

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

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigServerApplication.class, args);
    }
}
