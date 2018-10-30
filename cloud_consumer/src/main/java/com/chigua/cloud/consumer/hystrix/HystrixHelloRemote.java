package com.chigua.cloud.consumer.hystrix;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.chigua.cloud.common.result.HttpStatusEnum;
import com.chigua.cloud.common.result.Result;
import com.chigua.cloud.common.result.ResultUtil;
import com.chigua.cloud.consumer.feign.HelloRemote;

/**
 * 
 * @ClassName: HystrixHelloRemote
 * @Description: 熔断器HelloRemote
 * @author Mr.zhou
 * @date 2018年10月30日 上午10:08:10
 *
 */
@Component
public class HystrixHelloRemote implements HelloRemote{
	@ResponseBody
	@Override
	public String getDemo() {
		Result result=ResultUtil.error(HttpStatusEnum.REQUEST_TIMEOUT.code(), HttpStatusEnum.REQUEST_TIMEOUT.reasonPhraseCN());
		String json=JSON.toJSONString(result);
		return json;
	}

}
