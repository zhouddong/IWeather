package com.yingjun.ssm.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019/4/5.
 */

@Controller
@RequestMapping("/hello")
@ResponseBody
public class HelloWorld {
    @RequestMapping("/zhou")
    public Map<String,String> hello(){
        Map<String,String> hello = new HashMap<>();
        hello.put("nihao","hello");
        return hello;
    }
}
