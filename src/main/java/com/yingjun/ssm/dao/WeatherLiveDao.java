package com.yingjun.ssm.dao;

import com.yingjun.ssm.entity.EnvironmentCloudWeatherLive;

/**
 * Created by Administrator on 2019/4/5.
 */
public class WeatherLiveDao {
//    {"windspeed":"0.1","citycode":"101020100","airpressure":"1014.0","phenomena":"多云",
// "rdesc":"Success","humidity":"63.0","updatetime":"2019-04-05 21:05","windpower":"微风",
// "feelst":"17.6","winddirect":"9999","rcode":200,"rain":"0.0","temperature":"17.6"}

    public EnvironmentCloudWeatherLive getEnvironmentCloudWeatherLive(String citycode){
        EnvironmentCloudWeatherLive environmentCloudWeatherLive = new EnvironmentCloudWeatherLive();
//        environmentCloudWeatherLive.setWindSpeed("0.1");
//        environmentCloudWeatherLive.setCityId("101020100");
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
        return environmentCloudWeatherLive;
    }

}
