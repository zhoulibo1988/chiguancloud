package com.chigua.cloud.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @author zhoulibo
 * @description
 * @date 2018/10/27/027
 */
@FeignClient(name = "spring-cloud-provider")
public interface HelloRemote {
    @RequestMapping(value = "/demo/getDemo")
    public String getDemo();
}
