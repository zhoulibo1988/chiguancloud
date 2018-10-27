package com.chigua.cloud.consumer.controller;

import com.chigua.cloud.consumer.feign.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhoulibo
 * @description
 * @date 2018/10/27/027
 */
@RequestMapping("/mdemo")
@Controller
public class DemoController {
    @Autowired
    private HelloRemote helloRemote;
    @ResponseBody
    @RequestMapping(value = "/getDemo",method = RequestMethod.GET)
    public String getDemo(){
      return  helloRemote.getDemo();
    }
}
