package com.yingjun.ssm.service;

import com.yingjun.ssm.dao.EnvironmentCloudCityAirLiveDao;
import com.yingjun.ssm.entity.EnvironmentCloudCityAirLive;

/**
 * Created by Administrator on 2019/4/5.
 */
public interface EnvironmentCloudCityAirLiveService {

//    EnvironmentCloudCityAirLive getEnvironmentCloudCityAirLive(String citycode);

    void insertCityAirLive(EnvironmentCloudCityAirLive cloudCityAirLive);

    EnvironmentCloudCityAirLive findCityAirLiveByCityDode(String cityid);

}
