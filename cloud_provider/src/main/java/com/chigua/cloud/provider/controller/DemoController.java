package com.chigua.cloud.provider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhoulibo
 * @description
 * @date 2018/10/27/027
 */
@RequestMapping("/demo")
@Controller
public class DemoController {
    @ResponseBody
    @RequestMapping("/getDemo")
    public String getDemo(){
      return"nihao";
    }
}
