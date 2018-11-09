package com.chigua.cloud.zipkin.server;

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

	public static void main(String[] args) {
		SpringApplication.run(CloudZipkinServerApplication.class, args);
	}
}
