package com.yingjun.ssm.web;

import com.yingjun.ssm.entity.EnvironmentCloudForecast;
import com.yingjun.ssm.entity.ForecastEntity;
import com.yingjun.ssm.service.EnvironmentCloudForecastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2019/4/5.
 */

@Controller
@RequestMapping("/forecast")
@ResponseBody
public class EnvironmentCloudForecastController {

    @Autowired
    private EnvironmentCloudForecastService forecastService;

    @RequestMapping(value = "/{citycode}", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public HashMap<String, Object> getEnvironmentCloudForecast(@PathVariable("citycode") String citycode){
//        return forecastService.getEnvironmentCloudForecast(citycode);

        EnvironmentCloudForecast environmentCloudForecast = forecastService.findForecastByCityDode(citycode);
//        environmentCloudForecast.setCityId("100000000");
//        environmentCloudForecast.setRequestDesc("Success");
//        List<ForecastEntity> forecase = new ArrayList<>();
//        ForecastEntity forecastEntity = new ForecastEntity();
//        ForecastEntity.WindEntity windEntity = new ForecastEntity.WindEntity();
//        windEntity.setDir("西南风");
//        windEntity.setDeg("257");
//        windEntity.setSc("3-4");
//        windEntity.setSpd("22");
//        forecastEntity.setWind(windEntity);
//        forecastEntity.setHum("62");
//        forecastEntity.setPcpn("0.0");
//        ForecastEntity.AstroEntity astroEntity = new ForecastEntity.AstroEntity();
//        astroEntity.setMr("06.18");
//        astroEntity.setSr("05.35");
//        astroEntity.setMs("19.06");
//        astroEntity.setSs("18.17");
//        forecastEntity.setAstro(astroEntity);
//        forecastEntity.setUv("9");
//        ForecastEntity.TmpEntity tmpEntity = new ForecastEntity.TmpEntity();
//        tmpEntity.setMax("25");
//        tmpEntity.setMin("13");
// {"wind":{"dir":"西南风","deg":"249","sc":"3-4","spd":"24"},"hum":"58","pcpn":"0.0",
// "astro":{"mr":"06:18","sr":"05:35","ms":"19:06","ss":"18:17"},"uv":"9","tmp":{"min":"13","max":"22"},"pop":"0",
// "date":"2019-04-06","pres":"1011","cond":{"cond_n":"多云","cond_d":"多云"},"vis":"24"},

//
//        forecastEntity.setTmp(tmpEntity);
//        forecastEntity.setPop("0");
//        forecastEntity.setDate("2009-04-06");
//        forecastEntity.setPres("1011");
//        ForecastEntity.CondEntity condEntity = new ForecastEntity.CondEntity();
//        condEntity.setCond_n("多云");
//        condEntity.setCond_d("多云");
//        forecastEntity.setCond(condEntity);
//        forecastEntity.setVis("24");
//
//        forecase.add(forecastEntity);
//        forecase.add(forecastEntity);
//        forecase.add(forecastEntity);
//        forecase.add(forecastEntity);
//        forecase.add(forecastEntity);
//        forecase.add(forecastEntity);
//        forecase.add(forecastEntity);
//
//        environmentCloudForecast.setForecasts(forecase);
//
//        environmentCloudForecast.setRequestCode(200);
//
//        environmentCloudForecast.setCityName("上海");
//
//        EnvironmentCloudForecast.SuggestionEntity suggestionEntity = new EnvironmentCloudForecast.SuggestionEntity();
//        EnvironmentCloudForecast.SuggestionEntity.TravEntity travEntity = new EnvironmentCloudForecast.SuggestionEntity.TravEntity();
//        // "suggestion":{"trav":{"brf":"较不宜","txt":"天气较好，微风，但温度高，天气很热，请注意防暑降温，并注意防晒，若外出可选择水上娱乐等清凉项目。"},
//        // "uv":{"brf":"中等","txt":"属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"},
//        // "flu":{"brf":"少发","txt":"各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。"},
//        // "comf":{"brf":"很不舒适","txt":"白天天气晴好，但烈日炎炎您会感到很热，很不舒适。"},
//        // "sport":{"brf":"较不宜","txt":"天气较好，无雨水困扰，但考虑气温很高，请注意适当减少运动时间并降低运动强度，运动后及时补充水分。"},
//
//
//        travEntity.setBrf("较不宜");
//        travEntity.setTxt("天气较好，微风，但温度高，天气很热，请注意防暑降温，并注意防晒，若外出可选择水上娱乐等清凉项目.");
//        suggestionEntity.setTrav(travEntity);
//
//        EnvironmentCloudForecast.SuggestionEntity.UvEntity uvEntity = new EnvironmentCloudForecast.SuggestionEntity.UvEntity();
//        uvEntity.setBrf("中等");
//        uvEntity.setTxt("属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。");
//        suggestionEntity.setUv(uvEntity);
//
//        EnvironmentCloudForecast.SuggestionEntity.FluEntity fluEntity = new EnvironmentCloudForecast.SuggestionEntity.FluEntity();
//        fluEntity.setBrf("少发");
//        fluEntity.setTxt("各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。");
//        suggestionEntity.setFlu(fluEntity);
//
//        EnvironmentCloudForecast.SuggestionEntity.ComfEntity comfEntity = new EnvironmentCloudForecast.SuggestionEntity.ComfEntity();
//        comfEntity.setBrf("很不舒适");
//        comfEntity.setTxt("白天天气晴好，但烈日炎炎您会感到很热，很不舒适。");
//        suggestionEntity.setComf(comfEntity);
//
//        EnvironmentCloudForecast.SuggestionEntity.SportEntity sportEntity = new EnvironmentCloudForecast.SuggestionEntity.SportEntity();
//        sportEntity.setBrf("较不宜");
//        sportEntity.setTxt("天气较好，无雨水困扰，但考虑气温很高，请注意适当减少运动时间并降低运动强度，运动后及时补充水分。");
//        suggestionEntity.setSport(sportEntity);
//        // "air":{"brf":"中","txt":"气象条件对空气污染物稀释、扩散和清除无明显影响，易感人群应适当减少室外活动时间。"},
//        // "cw":{"brf":"较适宜","txt":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"},
//        // "drs":{"brf":"炎热","txt":"天气炎热，建议着短衫、短裙、短裤、薄型T恤衫等清凉夏季服装。"}},
//
//        EnvironmentCloudForecast.SuggestionEntity.AirEntity airEntity = new EnvironmentCloudForecast.SuggestionEntity.AirEntity();
//        airEntity.setBrf("中");
//        airEntity.setTxt("气象条件对空气污染物稀释、扩散和清除无明显影响，易感人群应适当减少室外活动时间。");
//        suggestionEntity.setAir(airEntity);
//
//        EnvironmentCloudForecast.SuggestionEntity.CwEntity cwEntity = new EnvironmentCloudForecast.SuggestionEntity.CwEntity();
//        cwEntity.setBrf("较适宜");
//        cwEntity.setTxt("较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。");
//        suggestionEntity.setCw(cwEntity);
//
//        EnvironmentCloudForecast.SuggestionEntity.DrsEntity drsEntity = new EnvironmentCloudForecast.SuggestionEntity.DrsEntity();
//        drsEntity.setBrf("炎热");
//        drsEntity.setTxt("天气炎热，建议着短衫、短裙、短裤、薄型T恤衫等清凉夏季服装。");
//        suggestionEntity.setDrs(drsEntity);
//
//        environmentCloudForecast.setSuggestion(suggestionEntity);
//        forecastService.insertForecast(environmentCloudForecast);
//        return forecastService.findForecastByCityDode(citycode);
        HashMap<String,Object> retmap = new HashMap<>();
        retmap.put("citycode",environmentCloudForecast.getCityId());
        retmap.put("rdesc","Success");
        retmap.put("forecast",environmentCloudForecast.getForecasts());
        retmap.put("rcode",200);
        retmap.put("suggestion",environmentCloudForecast.getSuggestion());
        retmap.put("cityname",environmentCloudForecast.getCityName());
        return retmap;

    }

}
