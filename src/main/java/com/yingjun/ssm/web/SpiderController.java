package com.yingjun.ssm.web;

import com.yingjun.ssm.service.impl.SpiderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2019/4/13.
 */

@Controller
@RequestMapping("spider")
public class SpiderController {

    @Autowired
    private SpiderService spiderService;

    @RequestMapping("test")
    public void spider(){
        spiderService.start();
    }

}
