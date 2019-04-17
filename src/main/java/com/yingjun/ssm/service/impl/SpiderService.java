package com.yingjun.ssm.service.impl;

import com.yingjun.ssm.entity.EnvironmentCloudCityAirLive;
import com.yingjun.ssm.entity.EnvironmentCloudForecast;
import com.yingjun.ssm.entity.EnvironmentCloudWeatherLive;
import com.yingjun.ssm.service.EnvironmentCloudCityAirLiveService;
import com.yingjun.ssm.service.EnvironmentCloudForecastService;
import com.yingjun.ssm.service.EnvironmentCloudWeatherLiveService;
import com.yingjun.ssm.util.RequestHelper;
import net.sf.json.JSONObject;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.*;

/**
 * Created by Administrator on 2019/4/13.
 */
@Service
public class SpiderService {

    private Set<String> weatherliveurl = new HashSet<>();

    private Set<String> cityAirliveurl = new HashSet<>();

    private Set<String> forecasturl = new HashSet<>();

    private String updatetime = "";
    @Autowired
    private EnvironmentCloudWeatherLiveService weatherLiveService;

    @Autowired
    private EnvironmentCloudCityAirLiveService cityAirLiveService;

    @Autowired
    private EnvironmentCloudForecastService forecastService;

    private final String weatherLiveUrl0 = "http://service.envicloud.cn:8082/v2/weatherlive/YMFYB256AGFUZZE0ODQ3MZM1MZE2NTU=/";

    private final String cityAirLiveUrl0 = "http://service.envicloud.cn:8082/v2/cityairlive/YMFYB256AGFUZZE0ODQ3MZM1MZE2NTU=/";

    private final String forecastUrl0 = "http://service.envicloud.cn:8082/v2/weatherforecast/YMFYB256AGFUZZE0ODQ3MZM1MZE2NTU=/";

    public void spider(String citycode) throws Exception {

        String weatherLiveUrl = weatherLiveUrl0 + citycode;
        String cityAirLiveUrl = cityAirLiveUrl0 + citycode;
        String forecastUrl = forecastUrl0 + citycode;

        spiderWeatherLive(weatherLiveUrl);
        if (updatetime != null && updatetime.length() != 0)
        {
            spiderCityAirLive(cityAirLiveUrl,updatetime);
            spiderForecast(forecastUrl,updatetime);
        }
//        EnvironmentCloudWeatherLive weatherLive = null;
//        JSONObject jsonObject = RequestHelper.httpRequest(weatherLiveUrl,"GET");
////        EnvironmentCloudWeatherLive weatherLive;
//        String updatetime = "";
//        if (jsonObject == null){
//            System.out.println(weatherLiveUrl);
//            weatherliveurl.add(weatherLiveUrl);
//        }
//        if (jsonObject != null && jsonObject.size() > 2){
//            weatherLive = EnvironmentCloudWeatherLive.getWeatherLiveFromJson(jsonObject);
//            updatetime = weatherLive.getUpdateTime();
//            try {
//                weatherLiveService.insertWeatherLive(weatherLive);
//            }catch (Exception e){
//                e.printStackTrace();
//                System.out.println("weatherlive wrong!");
//            }
//        }
//
//        EnvironmentCloudCityAirLive cityAirLive;
//        JSONObject cityAirLivejson = RequestHelper.httpRequest(cityAirLiveUrl,"GET");
//        if (cityAirLivejson == null){
//            System.out.println(cityAirLiveUrl);
//            cityAirliveurl.add(cityAirLiveUrl);
//        }
//        if (cityAirLivejson != null && cityAirLivejson.size() > 2){
//            cityAirLive = EnvironmentCloudCityAirLive.getCityAirLiveFromJson(cityAirLivejson);
//            cityAirLive.setUpdatetime(updatetime);
//            try{
//                cityAirLiveService.insertCityAirLive(cityAirLive);
//            }catch (Exception e){
//                e.printStackTrace();
//                System.out.println("cityAirLive wrong");
//            }
//        }
//
//        EnvironmentCloudForecast forecast ;
//        JSONObject forecastJson = RequestHelper.httpRequest(forecastUrl,"GET");
//        if (forecastJson == null){
//            System.out.println(forecastUrl);
//            forecasturl.add(forecastUrl);
//        }
//        if (forecastJson != null && forecastJson.size() > 2){
//            forecast = EnvironmentCloudForecast.getEnvironmentCloudForecastFromJson(forecastJson);
//            forecast.setUpdatetime(updatetime);
//            try {
//                forecastService.insertForecast(forecast);
//            }catch (Exception e){
////                e.printStackTrace();
//                if (forecast.getForecasts() == null || forecast.getForecasts().size() == 0){
//                    System.out.println("forecast wrong ");
//                    System.out.println(forecastUrl);
//                }
//            }
//        }
    }

    private void spiderWeatherLive(String url){
        EnvironmentCloudWeatherLive weatherLive = null;
        JSONObject jsonObject = RequestHelper.httpRequest(url,"GET");
        if (jsonObject == null){
            System.out.println(url);
            weatherliveurl.add(url);
        }
        if (jsonObject != null && jsonObject.size() > 2){
            weatherLive = EnvironmentCloudWeatherLive.getWeatherLiveFromJson(jsonObject);
            updatetime = weatherLive.getUpdateTime();
            try {
                weatherLiveService.insertWeatherLive(weatherLive);
            }catch (Exception e){
                e.printStackTrace();
                System.out.println("weatherlive wrong!");
            }
        }
    }

    private void spiderCityAirLive(String url,String updatetime){
        EnvironmentCloudCityAirLive cityAirLive;
        JSONObject cityAirLivejson = RequestHelper.httpRequest(url,"GET");
        if (cityAirLivejson == null){
            System.out.println(url);
            cityAirliveurl.add(url);
        }
        if (cityAirLivejson != null && cityAirLivejson.size() > 2){
            cityAirLive = EnvironmentCloudCityAirLive.getCityAirLiveFromJson(cityAirLivejson);
            cityAirLive.setUpdatetime(updatetime);
            try{
                cityAirLiveService.insertCityAirLive(cityAirLive);
            }catch (Exception e){
                e.printStackTrace();
                System.out.println("cityAirLive wrong");
            }
        }
    }

    private void spiderForecast(String url,String updatetime){
        EnvironmentCloudForecast forecast ;
        JSONObject forecastJson = RequestHelper.httpRequest(url,"GET");
        if (forecastJson == null){
            System.out.println(url);
            forecasturl.add(url);
        }
        if (forecastJson != null && forecastJson.size() > 2){
            forecast = EnvironmentCloudForecast.getEnvironmentCloudForecastFromJson(forecastJson);
            forecast.setUpdatetime(updatetime);
            try {
                forecastService.insertForecast(forecast);
            }catch (Exception e){
                if (forecast.getForecasts() == null || forecast.getForecasts().size() == 0){
                    System.out.println("forecast wrong ");
                    System.out.println(url);
                }
            }
        }

    }

    public static void main(String[] args){
        SpiderService spiderService = new SpiderService();
        try {
            spiderService.spider("101010100");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Scheduled(cron="* 17 *  * * ? ")
    public void print(){
        System.out.println("hello world!");
        start();
        for (String url : weatherliveurl) {
            System.out.println(url);
            spiderWeatherLive(url);
            weatherliveurl.remove(url);
        }
        weatherliveurl.clear();
        for (String url : cityAirliveurl) {
            System.out.println(url);
            spiderCityAirLive(url,updatetime);
            cityAirliveurl.remove(url);
        }
        cityAirliveurl.clear();
        for (String url : forecasturl) {
            System.out.println(url);
            spiderForecast(url,updatetime);
            forecasturl.remove(url);
        }
        forecasturl.clear();

//        for (int i = 0; i < cityAirliveurl.size(); i++) {
//            System.out.println(cityAirliveurl.get(i));
//            spiderCityAirLive(cityAirliveurl.get(i),updatetime);
//        }
//        cityAirliveurl.clear();
//        for (int i = 0; i < forecasturl.size(); i++) {
//            System.out.println(forecasturl.get(i));
//            spiderForecast(forecasturl.get(i),updatetime);
//        }
//        forecasturl.clear();
    }

    public void start(){
        SAXReader reader = new SAXReader();
        Document document = null;
        try {
            document = reader.read(new File("E:\\beauty_ssm\\target\\classes\\Weather.xml"));
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        Element root = document.getRootElement();
        List<Element> provinces = root.elements("province");
        for (Element province : provinces) {
            List<Element> cities = province.elements("city");
            for (Element city : cities) {
                List<Element> counties = city.elements("county");
                for (Element country : counties) {
//                    System.out.println(country.attribute("weatherCode").getValue());
                    String weathercode = country.attribute("weatherCode").getValue();
                    if (weathercode != null && weathercode.length() != 0)
                        try {
                            spider(weathercode);
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                }
            }
        }

    }

}


