package com.yingjun.ssm.service.impl;

import com.yingjun.ssm.dao.EnvironmentCloudForecastDao;
import com.yingjun.ssm.dao.ForecastDao;
import com.yingjun.ssm.entity.EnvironmentCloudForecast;
import com.yingjun.ssm.entity.ForecastEntity;
import com.yingjun.ssm.service.EnvironmentCloudForecastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/4/5.
 */
@Service
public class EnvironmentCloudForecastServiceImpl implements EnvironmentCloudForecastService {

    @Autowired
    private EnvironmentCloudForecastDao forecastDao;

    @Override
    public void insertForecast(EnvironmentCloudForecast environmentCloudForecast) {
        forecastDao.insertForecast(environmentCloudForecast);
        int fid = forecastDao.getfid();
        environmentCloudForecast.setFid(fid);
        forecastDao.insertForecasts(environmentCloudForecast);
    }

    @Override
    public EnvironmentCloudForecast findForecastByCityDode(String cityId) {
        EnvironmentCloudForecast forecast = forecastDao.findForecastByCityDode(cityId);
        List<ForecastEntity> forecasts = forecastDao.findForecastsByCityDode(forecast.getFid());
        if (forecasts != null && forecasts.size() != 0){
            forecast.setForecasts(forecasts);
        }
        return forecast;
    }

//    @Override
//    public EnvironmentCloudForecast getEnvironmentCloudForecast(String citycode) {
//        return forecastDao.getEnvironmentCloudForecast(citycode);
//    }
}
