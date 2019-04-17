package com.yingjun.ssm.web;

import com.yingjun.ssm.entity.EnvironmentCloudCityAirLive;
import com.yingjun.ssm.entity.EnvironmentCloudWeatherLive;
import com.yingjun.ssm.service.EnvironmentCloudCityAirLiveService;
import com.yingjun.ssm.service.EnvironmentCloudWeatherLiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

/**
 * Created by Administrator on 2019/4/5.
 */

@Controller
@RequestMapping("/weatherlive")
@ResponseBody
public class EnvironmentCloudWeatherLiveController {

    @Autowired
    private EnvironmentCloudWeatherLiveService service;

    @RequestMapping(value = "/{citycode}", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public HashMap<String, Object> getCityAirLive(@PathVariable("citycode") String citycode){
//        return service.getEnvironmentCloudWeatherLive(citycode);
        EnvironmentCloudWeatherLive environmentCloudWeatherLive = service.findWeatherLiveByCityDode(citycode);
//        environmentCloudWeatherLive.setWindSpeed("0.1");
//        environmentCloudWeatherLive.setCityId("100000001");
//        environmentCloudWeatherLive.setAirPressure("1014.0");
//        environmentCloudWeatherLive.setPhenomena("多云");
//        environmentCloudWeatherLive.setRequestDesc("Success");
//        environmentCloudWeatherLive.setHumidity("63.0");
//        environmentCloudWeatherLive.setTemperature("17.6");
//        environmentCloudWeatherLive.setUpdateTime("2009-04-05 21:05");
//        environmentCloudWeatherLive.setWindPower("微风");
//        environmentCloudWeatherLive.setFeelsTemperature("17.6");
//        environmentCloudWeatherLive.setWindDirect("9999");
//        environmentCloudWeatherLive.setRequestCode(200);
//        environmentCloudWeatherLive.setRain("0.0");
//        service.insertWeatherLive(environmentCloudWeatherLive);
//        return service.findWeatherLiveByCityDode(citycode);
        HashMap<String,Object> retmap = new HashMap<>();
        retmap.put("windspeed",environmentCloudWeatherLive.getWindSpeed());
        retmap.put("citycode",environmentCloudWeatherLive.getCityId());
        retmap.put("airpressure",environmentCloudWeatherLive.getAirPressure());
        retmap.put("rdesc",environmentCloudWeatherLive.getRequestDesc());
        retmap.put("humidity",environmentCloudWeatherLive.getHumidity());
        retmap.put("updatetime",environmentCloudWeatherLive.getUpdateTime());
        retmap.put("windpower",environmentCloudWeatherLive.getWindPower());
        retmap.put("feelst",environmentCloudWeatherLive.getFeelsTemperature());
        retmap.put("winddirect",environmentCloudWeatherLive.getWindDirect());
        retmap.put("rcode",environmentCloudWeatherLive.getRequestCode());
        retmap.put("rain",environmentCloudWeatherLive.getRain());
        retmap.put("temperature",environmentCloudWeatherLive.getTemperature());
        retmap.put("rcode",200);
        retmap.put("phenomena",environmentCloudWeatherLive.getPhenomena());
        return retmap;
    }


    @RequestMapping(value = "/test/{citycode}", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public HashMap<String, Object> setCityAirLive(@PathVariable("citycode") String citycode){
//        return service.getEnvironmentCloudWeatherLive(citycode);
        EnvironmentCloudWeatherLive environmentCloudWeatherLive = new EnvironmentCloudWeatherLive();

        environmentCloudWeatherLive.setWindSpeed("0.1");
        environmentCloudWeatherLive.setCityId("100000001");
        environmentCloudWeatherLive.setAirPressure("1014.0");
        environmentCloudWeatherLive.setPhenomena("多云");
        environmentCloudWeatherLive.setRequestDesc("Success");
        environmentCloudWeatherLive.setHumidity("63.0");
        environmentCloudWeatherLive.setTemperature("17.6");
        environmentCloudWeatherLive.setUpdateTime("2009-04-05 21:05");
        environmentCloudWeatherLive.setWindPower("微风");
        environmentCloudWeatherLive.setFeelsTemperature("17.6");
        environmentCloudWeatherLive.setWindDirect("9999");
        environmentCloudWeatherLive.setRequestCode(200);
        environmentCloudWeatherLive.setRain("0.0");
        service.insertWeatherLive(environmentCloudWeatherLive);
//        return service.findWeatherLiveByCityDode(citycode);
        HashMap<String,Object> retmap = new HashMap<>();
        retmap.put("windspeed",environmentCloudWeatherLive.getWindSpeed());
        retmap.put("citycode",environmentCloudWeatherLive.getCityId());
        retmap.put("airpressure",environmentCloudWeatherLive.getAirPressure());
        retmap.put("rdesc",environmentCloudWeatherLive.getRequestDesc());
        retmap.put("humidity",environmentCloudWeatherLive.getHumidity());
        retmap.put("updatetime",environmentCloudWeatherLive.getUpdateTime());
        retmap.put("windpower",environmentCloudWeatherLive.getWindPower());
        retmap.put("feelst",environmentCloudWeatherLive.getFeelsTemperature());
        retmap.put("winddirect",environmentCloudWeatherLive.getWindDirect());
        retmap.put("rcode",environmentCloudWeatherLive.getRequestCode());
        retmap.put("rain",environmentCloudWeatherLive.getRain());
        retmap.put("temperature",environmentCloudWeatherLive.getTemperature());
        return retmap;
    }



}
