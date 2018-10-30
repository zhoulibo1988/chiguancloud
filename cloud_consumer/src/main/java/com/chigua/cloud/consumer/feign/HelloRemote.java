package com.chigua.cloud.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chigua.cloud.consumer.hystrix.HystrixHelloRemote;

/**
 * @ClassName: HelloRemote
 * @Description: fallback：熔断器
 * @author Mr.zhou
 * @date 2018年10月30日 上午10:14:37
 *
 */
@FeignClient(name = "spring-cloud-provider",fallback=HystrixHelloRemote.class)
public interface HelloRemote {
    @RequestMapping(value = "/demo/getDemo")
    public String getDemo();
}
