package com.chigua.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
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
@Controller
@RequestMapping(value="/config")
public class ConfigController {
	@Value("${myname}")
	String myname;
	@ResponseBody
	@RequestMapping(value="/getmyname")
	public String getMyName() {
		return myname;
	}
}
