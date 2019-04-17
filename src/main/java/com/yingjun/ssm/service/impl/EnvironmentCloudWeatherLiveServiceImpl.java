package com.yingjun.ssm.service.impl;

import com.yingjun.ssm.dao.EnvironmentCloudWeatherLiveDao;
import com.yingjun.ssm.dao.WeatherLiveDao;
import com.yingjun.ssm.entity.EnvironmentCloudWeatherLive;
import com.yingjun.ssm.service.EnvironmentCloudWeatherLiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/4/5.
 */
@Service
public class EnvironmentCloudWeatherLiveServiceImpl implements EnvironmentCloudWeatherLiveService{

    @Autowired
    private EnvironmentCloudWeatherLiveDao weatherLiveDao;

    @Override
    public void insertWeatherLive(EnvironmentCloudWeatherLive environmentCloudWeatherLive) {
        weatherLiveDao.insertWeatherLive(environmentCloudWeatherLive);
    }

    @Override
    public EnvironmentCloudWeatherLive findWeatherLiveByCityDode(String cityId) {
        return weatherLiveDao.findWeatherLiveByCityDode(cityId);
    }

//    @Override
//    public EnvironmentCloudWeatherLive getEnvironmentCloudWeatherLive(String citycode) {
//        return weatherLiveDao.getEnvironmentCloudWeatherLive(citycode);
//    }
}
