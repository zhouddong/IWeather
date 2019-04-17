package com.yingjun.ssm.dao;

import com.yingjun.ssm.entity.EnvironmentCloudCityAirLive;
import com.yingjun.ssm.entity.EnvironmentCloudWeatherLive;

/**
 * Created by Administrator on 2019/4/8.
 */
public interface EnvironmentCloudWeatherLiveDao {

    void insertWeatherLive(EnvironmentCloudWeatherLive environmentCloudWeatherLive);

    EnvironmentCloudWeatherLive findWeatherLiveByCityDode(String cityId);


}
