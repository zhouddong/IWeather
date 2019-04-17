package com.yingjun.ssm.dao;

import com.yingjun.ssm.entity.EnvironmentCloudForecast;
import com.yingjun.ssm.entity.EnvironmentCloudWeatherLive;
import com.yingjun.ssm.entity.ForecastEntity;

import java.util.List;

/**
 * Created by Administrator on 2019/4/8.
 */
public interface EnvironmentCloudForecastDao {

    void insertForecast(EnvironmentCloudForecast environmentCloudForecast);

    void insertForecasts(EnvironmentCloudForecast environmentCloudForecast);

    int getfid();

    EnvironmentCloudForecast findForecastByCityDode(String cityId);

    List<ForecastEntity> findForecastsByCityDode(int fid);


}
