package com.yingjun.ssm.web;

import com.yingjun.ssm.entity.EnvironmentCloudCityAirLive;
import com.yingjun.ssm.service.EnvironmentCloudCityAirLiveService;
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
@ResponseBody
@RequestMapping("cityAirLive")
public class EnvironmentCloudCityAirLiveControl {

    @Autowired
    private EnvironmentCloudCityAirLiveService service;

    @RequestMapping(value = "/{citycode}", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public HashMap<String, Object> getCityAirLive(@PathVariable("citycode") String citycode){
//        return service.getEnvironmentCloudCityAirLive(citycode);
        EnvironmentCloudCityAirLive cityAirLive = service.findCityAirLiveByCityDode(citycode);
//        cityAirLive.setCityId("100000001");
//        cityAirLive.setPm25("63");
//        cityAirLive.setTime("2009040520");
//        cityAirLive.setRequestDesc("Success");
//        cityAirLive.setPm10("98");
//        cityAirLive.setSo2("7.67");
//        cityAirLive.setO3("122.33");
//        cityAirLive.setNo2("45.33");
//        cityAirLive.setPrimary("细颗粒物(PM2.5)");
//        cityAirLive.setRequestCode(200);
//        cityAirLive.setAqi("80");
//        cityAirLive.setCo("0.75");
        HashMap<String,Object> retmap = new HashMap<>();

        retmap.put("citycode",cityAirLive.getCityId());
        retmap.put("PM25",cityAirLive.getPm25());
        retmap.put("time",cityAirLive.getTime());
//        retmap.put("time","2019041619");
        retmap.put("rdesc",cityAirLive.getRequestDesc());
        retmap.put("PM10",cityAirLive.getPm10());
        retmap.put("SO2",cityAirLive.getSo2());
        retmap.put("o3",cityAirLive.getO3());
        retmap.put("NO2",cityAirLive.getNo2());
        retmap.put("primary",cityAirLive.getPrimary());
        retmap.put("rcode",cityAirLive.getRequestCode());
        retmap.put("AQI",cityAirLive.getAqi());
        retmap.put("CO",cityAirLive.getCo());
        retmap.put("rcode",200);

//        service.insertCityAirLive(cityAirLive);
//        EnvironmentCloudCityAirLive airLive = service.findCityAirLiveByCityDode(citycode);
        return retmap;
    }

    @RequestMapping(value = "/test/{citycode}", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public HashMap<String, Object> setCityAirLive(@PathVariable("citycode") String citycode){
//        return service.getEnvironmentCloudCityAirLive(citycode);
        EnvironmentCloudCityAirLive cityAirLive = new EnvironmentCloudCityAirLive();
        cityAirLive.setCityId("100000001");
        cityAirLive.setPm25("63");
        cityAirLive.setTime("2009040520");
        cityAirLive.setRequestDesc("Success");
        cityAirLive.setPm10("98");
        cityAirLive.setSo2("7.67");
        cityAirLive.setO3("122.33");
        cityAirLive.setNo2("45.33");
        cityAirLive.setPrimary("细颗粒物(PM2.5)");
        cityAirLive.setRequestCode(200);
        cityAirLive.setAqi("80");
        cityAirLive.setCo("0.75");
        cityAirLive.setUpdatetime("2019-4-16");
        HashMap<String,Object> retmap = new HashMap<>();

        retmap.put("citycode",cityAirLive.getCityId());
        retmap.put("PM25",cityAirLive.getPm25());
        retmap.put("time",cityAirLive.getTime());
        retmap.put("rdesc",cityAirLive.getRequestDesc());
        retmap.put("PM10",cityAirLive.getPm10());
        retmap.put("SO2",cityAirLive.getSo2());
        retmap.put("o3",cityAirLive.getO3());
        retmap.put("NO2",cityAirLive.getNo2());
        retmap.put("primary",cityAirLive.getPrimary());
        retmap.put("rcode",cityAirLive.getRequestCode());
        retmap.put("AQI",cityAirLive.getAqi());
        retmap.put("CO",cityAirLive.getCo());
        retmap.put("updatetime",cityAirLive.getUpdatetime());
        service.insertCityAirLive(cityAirLive);
//        EnvironmentCloudCityAirLive airLive = service.findCityAirLiveByCityDode(citycode);
        return retmap;
    }


}
