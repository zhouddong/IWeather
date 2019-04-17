package com.yingjun.ssm.dao;

import com.yingjun.ssm.entity.EnvironmentCloudForecast;
import com.yingjun.ssm.entity.ForecastEntity;
import sun.util.resources.cldr.en.TimeZoneNames_en_NZ;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/4/5.
 */
public class ForecastDao {
//    {"citycode":"101020100","rdesc":"Success",
// "forecast":[
// {"wind":{"dir":"西南风","deg":"257","sc":"3-4","spd":"22"},"hum":"62","pcpn":"0.0",
// "astro":{"mr":"05:47","sr":"05:37","ms":"18:10","ss":"18:16"},"uv":"9","tmp":{"min":"12","max":"20"},"pop":"0",
// "date":"2019-04-05","pres":"1015","cond":{"cond_n":"多云","cond_d":"多云"},"vis":"25"},
// {"wind":{"dir":"东北风","deg":"47","sc":"1-2","spd":"7"},"hum":"61","pcpn":"0.0",
// "astro":{"mr":"06:51","sr":"05:34","ms":"20:03","ss":"18:17"},"uv":"9","tmp":{"min":"11","max":"25"},"pop":"25",
// "date":"2019-04-07","pres":"1010","cond":{"cond_n":"小雨","cond_d":"晴"},"vis":"25"},
// {"wind":{"dir":"东风","deg":"80","sc":"3-4","spd":"24"},"hum":"55","pcpn":"0.0","astro":{"mr":"07:27","sr":"05:33","ms":"21:01","ss":"18:18"},"uv":"3","tmp":{"min":"14","max":"18"},"pop":"25","date":"2019-04-08","pres":"1020","cond":{"cond_n":"阴","cond_d":"阴"},"vis":"14"},{"wind":{"dir":"东风","deg":"96","sc":"4-5","spd":"31"},"hum":"81","pcpn":"5.1","astro":{"mr":"08:05","sr":"05:32","ms":"22:01","ss":"18:19"},"uv":"3","tmp":{"min":"11","max":"16"},"pop":"80","date":"2019-04-09","pres":"1016","cond":{"cond_n":"中雨","cond_d":"中雨"},"vis":"16"},{"wind":{"dir":"东北风","deg":"36","sc":"3-4","spd":"17"},"hum":"77","pcpn":"0.0","astro":{"mr":"08:49","sr":"05:31","ms":"23:02","ss":"18:19"},"uv":"2","tmp":{"min":"12","max":"17"},"pop":"3","date":"2019-04-10","pres":"1017","cond":{"cond_n":"多云","cond_d":"多云"},"vis":"24"},{"wind":{"dir":"东北风","deg":"13","sc":"3-4","spd":"15"},"hum":"65","pcpn":"0.0","astro":{"mr":"09:39","sr":"05:29","ms":"00:00","ss":"18:20"},"uv":"6","tmp":{"min":"12","max":"17"},"pop":"25","date":"2019-04-11","pres":"1018","cond":{"cond_n":"阴","cond_d":"阴"},"vis":"25"}],
//
// "rcode":200,
// "suggestion":{"trav":{"brf":"较不宜","txt":"天气较好，微风，但温度高，天气很热，请注意防暑降温，并注意防晒，若外出可选择水上娱乐等清凉项目。"},"uv":{"brf":"中等","txt":"属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"},"flu":{"brf":"少发","txt":"各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。"},"comf":{"brf":"很不舒适","txt":"白天天气晴好，但烈日炎炎您会感到很热，很不舒适。"},"sport":{"brf":"较不宜","txt":"天气较好，无雨水困扰，但考虑气温很高，请注意适当减少运动时间并降低运动强度，运动后及时补充水分。"},
// "air":{"brf":"中","txt":"气象条件对空气污染物稀释、扩散和清除无明显影响，易感人群应适当减少室外活动时间。"},"cw":{"brf":"较适宜","txt":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"},"drs":{"brf":"炎热","txt":"天气炎热，建议着短衫、短裙、短裤、薄型T恤衫等清凉夏季服装。"}},
// "cityname":"上海"}

    public EnvironmentCloudForecast getEnvironmentCloudForecast(String citycode){
        EnvironmentCloudForecast environmentCloudForecast = new EnvironmentCloudForecast();
        environmentCloudForecast.setCityId("101020100");
        environmentCloudForecast.setRequestDesc("Success");
        List<ForecastEntity> forecase = new ArrayList<>();
        ForecastEntity forecastEntity = new ForecastEntity();
        ForecastEntity.WindEntity windEntity = new ForecastEntity.WindEntity();
        windEntity.setDir("西南风");
        windEntity.setDeg("257");
        windEntity.setSc("3-4");
        windEntity.setSpd("22");
        forecastEntity.setWind(windEntity);
        forecastEntity.setHum("62");
        forecastEntity.setPcpn("0.0");
        ForecastEntity.AstroEntity astroEntity = new ForecastEntity.AstroEntity();
        astroEntity.setMr("06:18");
        astroEntity.setSr("05:35");
        astroEntity.setMs("19:06");
        astroEntity.setSs("18:17");
        forecastEntity.setAstro(astroEntity);
        forecastEntity.setUv("9");
        ForecastEntity.TmpEntity tmpEntity = new ForecastEntity.TmpEntity();
        tmpEntity.setMax("25");
        tmpEntity.setMin("13");
// {"wind":{"dir":"西南风","deg":"249","sc":"3-4","spd":"24"},"hum":"58","pcpn":"0.0",
// "astro":{"mr":"06:18","sr":"05:35","ms":"19:06","ss":"18:17"},"uv":"9","tmp":{"min":"13","max":"22"},"pop":"0",
// "date":"2019-04-06","pres":"1011","cond":{"cond_n":"多云","cond_d":"多云"},"vis":"24"},


        forecastEntity.setTmp(tmpEntity);
        forecastEntity.setPop("0");
        forecastEntity.setDate("2009-04-06");
        forecastEntity.setPres("1011");
        ForecastEntity.CondEntity condEntity = new ForecastEntity.CondEntity();
        condEntity.setCond_n("多云");
        condEntity.setCond_d("多云");
        forecastEntity.setCond(condEntity);
        forecastEntity.setVis("24");

        forecase.add(forecastEntity);
        forecase.add(forecastEntity);
        forecase.add(forecastEntity);
        forecase.add(forecastEntity);
        forecase.add(forecastEntity);
        forecase.add(forecastEntity);
        forecase.add(forecastEntity);

        environmentCloudForecast.setForecasts(forecase);

        environmentCloudForecast.setRequestCode(200);

        environmentCloudForecast.setCityName("上海");

        EnvironmentCloudForecast.SuggestionEntity suggestionEntity = new EnvironmentCloudForecast.SuggestionEntity();
        EnvironmentCloudForecast.SuggestionEntity.TravEntity travEntity = new EnvironmentCloudForecast.SuggestionEntity.TravEntity();
        // "suggestion":{"trav":{"brf":"较不宜","txt":"天气较好，微风，但温度高，天气很热，请注意防暑降温，并注意防晒，若外出可选择水上娱乐等清凉项目。"},
        // "uv":{"brf":"中等","txt":"属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"},
        // "flu":{"brf":"少发","txt":"各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。"},
        // "comf":{"brf":"很不舒适","txt":"白天天气晴好，但烈日炎炎您会感到很热，很不舒适。"},
        // "sport":{"brf":"较不宜","txt":"天气较好，无雨水困扰，但考虑气温很高，请注意适当减少运动时间并降低运动强度，运动后及时补充水分。"},


        travEntity.setBrf("较不宜");
        travEntity.setTxt("天气较好，微风，但温度高，天气很热，请注意防暑降温，并注意防晒，若外出可选择水上娱乐等清凉项目.");
        suggestionEntity.setTrav(travEntity);

        EnvironmentCloudForecast.SuggestionEntity.UvEntity uvEntity = new EnvironmentCloudForecast.SuggestionEntity.UvEntity();
        uvEntity.setBrf("中等");
        uvEntity.setTxt("属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。");
        suggestionEntity.setUv(uvEntity);

        EnvironmentCloudForecast.SuggestionEntity.FluEntity fluEntity = new EnvironmentCloudForecast.SuggestionEntity.FluEntity();
        fluEntity.setBrf("少发");
        fluEntity.setTxt("各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。");
        suggestionEntity.setFlu(fluEntity);

        EnvironmentCloudForecast.SuggestionEntity.ComfEntity comfEntity = new EnvironmentCloudForecast.SuggestionEntity.ComfEntity();
        comfEntity.setBrf("很不舒适");
        comfEntity.setTxt("白天天气晴好，但烈日炎炎您会感到很热，很不舒适。");
        suggestionEntity.setComf(comfEntity);

        EnvironmentCloudForecast.SuggestionEntity.SportEntity sportEntity = new EnvironmentCloudForecast.SuggestionEntity.SportEntity();
        sportEntity.setBrf("较不宜");
        sportEntity.setTxt("天气较好，无雨水困扰，但考虑气温很高，请注意适当减少运动时间并降低运动强度，运动后及时补充水分。");
        suggestionEntity.setSport(sportEntity);
        // "air":{"brf":"中","txt":"气象条件对空气污染物稀释、扩散和清除无明显影响，易感人群应适当减少室外活动时间。"},
        // "cw":{"brf":"较适宜","txt":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"},
        // "drs":{"brf":"炎热","txt":"天气炎热，建议着短衫、短裙、短裤、薄型T恤衫等清凉夏季服装。"}},

        EnvironmentCloudForecast.SuggestionEntity.AirEntity airEntity = new EnvironmentCloudForecast.SuggestionEntity.AirEntity();
        airEntity.setBrf("中");
        airEntity.setTxt("气象条件对空气污染物稀释、扩散和清除无明显影响，易感人群应适当减少室外活动时间。");
        suggestionEntity.setAir(airEntity);

        EnvironmentCloudForecast.SuggestionEntity.CwEntity cwEntity = new EnvironmentCloudForecast.SuggestionEntity.CwEntity();
        cwEntity.setBrf("较适宜");
        cwEntity.setTxt("较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。");
        suggestionEntity.setCw(cwEntity);

        EnvironmentCloudForecast.SuggestionEntity.DrsEntity drsEntity = new EnvironmentCloudForecast.SuggestionEntity.DrsEntity();
        drsEntity.setBrf("炎热");
        drsEntity.setTxt("天气炎热，建议着短衫、短裙、短裤、薄型T恤衫等清凉夏季服装。");
        suggestionEntity.setDrs(drsEntity);

        environmentCloudForecast.setSuggestion(suggestionEntity);

        return environmentCloudForecast;

    }

}
