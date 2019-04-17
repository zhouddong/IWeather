package com.yingjun.ssm.dao;

import com.yingjun.ssm.entity.EnvironmentCloudCityAirLive;

/**
 * Created by Administrator on 2019/4/5.
 */

public class CityAirLiveDao {

//    {"citycode":"101020100","PM25":"63","time":"2019040520","rdesc":"Success","PM10":"98",
// "SO2":"7.67","o3":"122.33","NO2":"45.33","primary":"细颗粒物(PM2.5)","rcode":200,
// "CO":"0.75","AQI":"80"}

    public EnvironmentCloudCityAirLive getCityAirLive(String citycode){
        EnvironmentCloudCityAirLive cityAirLive = new EnvironmentCloudCityAirLive();
//        cityAirLive.setCityId("101020100");
//        cityAirLive.setPm25("63");
//        cityAirLive.setTime("2009040520");
//        cityAirLive.setRequestDesc("Success");
//        cityAirLive.setPm10("98");
//        cityAirLive.setSo2("7.67");
//        cityAirLive.setO3("122.33");
//        cityAirLive.setNo2("45.33");
//        cityAirLive.setPrimary("细颗粒物(PM2.5)");
//        cityAirLive.setRequestCode(200);
        return cityAirLive;
    }

}
