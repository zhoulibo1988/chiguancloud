package com.chigua.cloud.zipkin.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import zipkin.server.EnableZipkinServer;
/**
 * 
 * @ClassName: CloudZipkinServerApplication
 * @Description: spring cloud Sleuth 服务跟踪提供者
 * @author Mr.zhou
 * @date 2018年11月7日 下午12:08:16
 *
 */
@EnableZipkinServer
@SpringBootApplication
@EnableDiscoveryClient
public class CloudZipkinServerApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(CloudZipkinServerApplication.class);
	public static void main(String[] args) {
		LOGGER.info("-----------------》》Zipkin启动");
		SpringApplication.run(CloudZipkinServerApplication.class, args);
	}
}
