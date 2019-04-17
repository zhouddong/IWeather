package com.yingjun.ssm.service.impl;

import com.yingjun.ssm.dao.CityAirLiveDao;
import com.yingjun.ssm.dao.EnvironmentCloudCityAirLiveDao;
import com.yingjun.ssm.entity.EnvironmentCloudCityAirLive;
import com.yingjun.ssm.service.EnvironmentCloudCityAirLiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/4/5.
 */
@Service
public class EnvironmentCloudCityAirLiveServiceImpl implements EnvironmentCloudCityAirLiveService {

    @Autowired
    EnvironmentCloudCityAirLiveDao cityAirLiveDao;

    @Override
    public void insertCityAirLive(EnvironmentCloudCityAirLive cloudCityAirLiveDao) {
        cityAirLiveDao.insertCityAirLive(cloudCityAirLiveDao);
    }

    @Override
    public EnvironmentCloudCityAirLive findCityAirLiveByCityDode(String cityid) {
        return cityAirLiveDao.findCityAirLiveByCityDode(cityid);
    }

//    @Override
//    public EnvironmentCloudCityAirLive getEnvironmentCloudCityAirLive(String citycode) {
//        return cityAirLiveDao.getCityAirLive(citycode);
//    }
}
