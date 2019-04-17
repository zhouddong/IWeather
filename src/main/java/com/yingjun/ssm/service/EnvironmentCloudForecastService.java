package com.yingjun.ssm.service;

import com.yingjun.ssm.entity.EnvironmentCloudForecast;

/**
 * Created by Administrator on 2019/4/5.
 */
public interface EnvironmentCloudForecastService {

//    EnvironmentCloudForecast getEnvironmentCloudForecast(String citycode);

    void insertForecast(EnvironmentCloudForecast environmentCloudForecast);

    EnvironmentCloudForecast findForecastByCityDode(String cityId);

}
