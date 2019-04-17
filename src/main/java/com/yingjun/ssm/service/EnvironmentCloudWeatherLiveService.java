package com.yingjun.ssm.service;

import com.yingjun.ssm.entity.EnvironmentCloudWeatherLive;

/**
 * Created by Administrator on 2019/4/5.
 */
public interface EnvironmentCloudWeatherLiveService {

//    EnvironmentCloudWeatherLive getEnvironmentCloudWeatherLive(String citycode);

    void insertWeatherLive(EnvironmentCloudWeatherLive environmentCloudWeatherLive);

    EnvironmentCloudWeatherLive findWeatherLiveByCityDode(String cityId);


}
