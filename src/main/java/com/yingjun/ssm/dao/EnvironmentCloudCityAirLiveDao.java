package com.yingjun.ssm.dao;

import com.yingjun.ssm.entity.EnvironmentCloudCityAirLive;

/**
 * Created by Administrator on 2019/4/8.
 */
public interface EnvironmentCloudCityAirLiveDao {

    void insertCityAirLive(EnvironmentCloudCityAirLive cloudCityAirLive);

    EnvironmentCloudCityAirLive findCityAirLiveByCityDode(String cityId);

}
