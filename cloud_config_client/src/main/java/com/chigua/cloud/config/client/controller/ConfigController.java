package com.chigua.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
* @ClassName: ConfigController 
* @Description: Spring cloud config client控制器
* @author Mr.zhou 
* @date 2018年10月27日 下午10:52:18
 */
@RefreshScope
@Controller
@RequestMapping(value="/config")
public class ConfigController {
	@Value("${mynames}")
	String mynames;
	@ResponseBody
	@RequestMapping(value="/getmynames")
	public String getMyName() {
		return mynames;
	}
}
