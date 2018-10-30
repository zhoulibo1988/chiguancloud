package com.chigua.cloud.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @ClassName: CloudCommonApplication
 * @Description: 公共服务控制器
 * @author Mr.zhou
 * @date 2018年10月30日 下午2:13:24
 *
 */
@SpringBootApplication
public class CloudCommonApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(CloudCommonApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CloudCommonApplication.class, args);
	}
}
