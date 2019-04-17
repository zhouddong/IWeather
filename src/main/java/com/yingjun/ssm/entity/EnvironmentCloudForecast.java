package com.yingjun.ssm.entity;

/**
 * Created by Administrator on 2019/4/5.
 */
import com.alibaba.fastjson.annotation.JSONField;
import com.yingjun.ssm.util.RequestHelper;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 *         2017/2/16
 */
public class EnvironmentCloudForecast {


    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    /**
     * citycode : 101020100
     * rdesc : Success
     * suggestion : {"uv":{"txt":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。","brf":"最弱"},"cw":{"txt":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。","brf":"不宜"},"drs":{"txt":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。","brf":"较冷"},"trav":{"txt":"温度适宜，又有较弱降水和微风作伴，会给您的旅行带来意想不到的景象，适宜旅游，可不要错过机会呦！","brf":"适宜"},"air":{"txt":"气象条件对空气污染物稀释、扩散和清除无明显影响，易感人群应适当减少室外活动时间。","brf":"中"},"comf":{"txt":"白天会有降雨，这种天气条件下，人们会感到有些凉意，但大部分人完全可以接受。","brf":"较舒适"},"sport":{"txt":"有降水，推荐您在室内进行各种健身休闲运动，若坚持户外运动，须注意保暖并携带雨具。","brf":"较不宜"},"flu":{"txt":"天气较凉，较易发生感冒，请适当增加衣服。体质较弱的朋友尤其应该注意防护。","brf":"较易发"}}
     * cityname : 上海
     * rcode : 200
     * forecast : [{"pop":"0","date":"2017-02-16","uv":"5","vis":"10","hum":"74","astro":{"ss":"17:42","mr":"22:42","ms":"09:41","sr":"06:34"},"pres":"1020","pcpn":"0.0","tmp":{"min":"10","max":"19"},"cond":{"cond_d":"小雨","cond_n":"阴"},"wind":{"sc":"微风","spd":"4","deg":"204","dir":"南风"}},{"pop":"70","date":"2017-02-17","uv":"6","vis":"10","hum":"77","astro":{"ss":"17:43","mr":"23:35","ms":"10:15","sr":"06:33"},"pres":"1025","pcpn":"0.3","tmp":{"min":"6","max":"15"},"cond":{"cond_d":"小雨","cond_n":"小雨"},"wind":{"sc":"3-4","spd":"10","deg":"28","dir":"东北风"}},{"pop":"33","date":"2017-02-18","uv":"6","vis":"10","hum":"72","astro":{"ss":"17:43","mr":"null","ms":"10:52","sr":"06:32"},"pres":"1029","pcpn":"0.0","tmp":{"min":"6","max":"10"},"cond":{"cond_d":"多云","cond_n":"晴"},"wind":{"sc":"微风","spd":"6","deg":"75","dir":"东南风"}},{"pop":"0","date":"2017-02-19","uv":"5","vis":"10","hum":"78","astro":{"ss":"17:44","mr":"00:27","ms":"11:31","sr":"06:31"},"pres":"1019","pcpn":"0.0","tmp":{"min":"10","max":"16"},"cond":{"cond_d":"多云","cond_n":"多云"},"wind":{"sc":"微风","spd":"1","deg":"174","dir":"东南风"}},{"pop":"0","date":"2017-02-20","uv":"N/A","vis":"10","hum":"81","astro":{"ss":"17:45","mr":"01:19","ms":"12:12","sr":"06:30"},"pres":"1013","pcpn":"0.0","tmp":{"min":"10","max":"19"},"cond":{"cond_d":"多云","cond_n":"小雨"},"wind":{"sc":"3-4","spd":"14","deg":"168","dir":"东北风"}},{"pop":"71","date":"2017-02-21","uv":"N/A","vis":"9","hum":"83","astro":{"ss":"17:46","mr":"02:10","ms":"12:57","sr":"06:29"},"pres":"1012","pcpn":"4.9","tmp":{"min":"7","max":"14"},"cond":{"cond_d":"小雨","cond_n":"小雨"},"wind":{"sc":"微风","spd":"0","deg":"94","dir":"东南风"}},{"pop":"100","date":"2017-02-22","uv":"N/A","vis":"2","hum":"91","astro":{"ss":"17:47","mr":"03:00","ms":"13:46","sr":"06:28"},"pres":"1016","pcpn":"9.7","tmp":{"min":"2","max":"11"},"cond":{"cond_d":"小雨","cond_n":"中雨"},"wind":{"sc":"4-5","spd":"23","deg":"340","dir":"西北风"}}]
     */

    private int fid;

    @JSONField(name = "rcode")
    private int requestCode;//结果吗

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    private String updatetime;

    @JSONField(name = "rdesc")
    private String requestDesc;//结果描述

    private SuggestionEntity suggestion;//生活指数

    @JSONField(name = "citycode")
    private String cityId;//城市ID

    @JSONField(name = "cityname")
    private String cityName;//城市名

    private List<ForecastEntity> forecasts;//天气预报

    public int getRequestCode() {
        return requestCode;
    }

    public void setRequestCode(int requestCode) {
        this.requestCode = requestCode;
    }

    public String getRequestDesc() {
        return requestDesc;
    }

    public void setRequestDesc(String requestDesc) {
        this.requestDesc = requestDesc;
    }

    public SuggestionEntity getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(SuggestionEntity suggestion) {
        this.suggestion = suggestion;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<ForecastEntity> getForecasts() {
        return forecasts;
    }

    public void setForecasts(List<ForecastEntity> forecast) {
        this.forecasts = forecast;
    }

    public static class SuggestionEntity {
        /**
         * uv : {"txt":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。","brf":"最弱"}
         * cw : {"txt":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。","brf":"不宜"}
         * drs : {"txt":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。","brf":"较冷"}
         * trav : {"txt":"温度适宜，又有较弱降水和微风作伴，会给您的旅行带来意想不到的景象，适宜旅游，可不要错过机会呦！","brf":"适宜"}
         * air : {"txt":"气象条件对空气污染物稀释、扩散和清除无明显影响，易感人群应适当减少室外活动时间。","brf":"中"}
         * comf : {"txt":"白天会有降雨，这种天气条件下，人们会感到有些凉意，但大部分人完全可以接受。","brf":"较舒适"}
         * sport : {"txt":"有降水，推荐您在室内进行各种健身休闲运动，若坚持户外运动，须注意保暖并携带雨具。","brf":"较不宜"}
         * flu : {"txt":"天气较凉，较易发生感冒，请适当增加衣服。体质较弱的朋友尤其应该注意防护。","brf":"较易发"}
         */

        private UvEntity uv;//紫外线
        private CwEntity cw;//洗车指数
        private DrsEntity drs;//穿衣指数
        private TravEntity trav;//旅游指数
        private AirEntity air;//空气质量指数
        private ComfEntity comf;//s舒适度指数
        private SportEntity sport;//运动指数
        private FluEntity flu;//感冒指数

        public UvEntity getUv() {
            return uv;
        }

        public void setUv(UvEntity uv) {
            this.uv = uv;
        }

        public CwEntity getCw() {
            return cw;
        }

        public void setCw(CwEntity cw) {
            this.cw = cw;
        }

        public DrsEntity getDrs() {
            return drs;
        }

        public void setDrs(DrsEntity drs) {
            this.drs = drs;
        }

        public TravEntity getTrav() {
            return trav;
        }

        public void setTrav(TravEntity trav) {
            this.trav = trav;
        }

        public AirEntity getAir() {
            return air;
        }

        public void setAir(AirEntity air) {
            this.air = air;
        }

        public ComfEntity getComf() {
            return comf;
        }

        public void setComf(ComfEntity comf) {
            this.comf = comf;
        }

        public SportEntity getSport() {
            return sport;
        }

        public void setSport(SportEntity sport) {
            this.sport = sport;
        }

        public FluEntity getFlu() {
            return flu;
        }

        public void setFlu(FluEntity flu) {
            this.flu = flu;
        }

        public static class UvEntity {
            /**
             * txt : 属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。
             * brf : 最弱
             */

            private String txt;//生活指数详情
            private String brf;//生活指数简介

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public static UvEntity getUvEntityFromJson(JSONObject jsonObject){

                String txt = jsonObject.getString("txt");
                String brf = jsonObject.getString("brf");

                UvEntity uvEntity = new UvEntity();
                uvEntity.setTxt(txt);
                uvEntity.setBrf(brf);

                return uvEntity;
            }
        }

        public static class CwEntity {
            /**
             * txt : 不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。
             * brf : 不宜
             */

            private String txt;
            private String brf;

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public static CwEntity getCwEntityFromJson(JSONObject jsonObject){

                String txt = jsonObject.getString("txt");
                String brf = jsonObject.getString("brf");

                CwEntity entity = new CwEntity();
                entity.setTxt(txt);
                entity.setBrf(brf);

                return entity;
            }


        }

        public static class DrsEntity {
            /**
             * txt : 建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。
             * brf : 较冷
             */

            private String txt;
            private String brf;

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public static DrsEntity getDrsEntityFromJson(JSONObject jsonObject){

                String txt = jsonObject.getString("txt");
                String brf = jsonObject.getString("brf");

                DrsEntity entity = new DrsEntity();
                entity.setTxt(txt);
                entity.setBrf(brf);

                return entity;
            }

        }

        public static class TravEntity {
            /**
             * txt : 温度适宜，又有较弱降水和微风作伴，会给您的旅行带来意想不到的景象，适宜旅游，可不要错过机会呦！
             * brf : 适宜
             */

            private String txt;
            private String brf;

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public static TravEntity getTravEntityFromJson(JSONObject jsonObject){

                String txt = jsonObject.getString("txt");
                String brf = jsonObject.getString("brf");

                TravEntity entity = new TravEntity();
                entity.setTxt(txt);
                entity.setBrf(brf);

                return entity;
            }


        }

        public static class AirEntity {
            /**
             * txt : 气象条件对空气污染物稀释、扩散和清除无明显影响，易感人群应适当减少室外活动时间。
             * brf : 中
             */

            private String txt;
            private String brf;

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public static AirEntity getAirEntityFromJson(JSONObject jsonObject){

                String txt = jsonObject.getString("txt");
                String brf = jsonObject.getString("brf");

                AirEntity entity = new AirEntity();
                entity.setTxt(txt);
                entity.setBrf(brf);

                return entity;
            }


        }

        public static class ComfEntity {
            /**
             * txt : 白天会有降雨，这种天气条件下，人们会感到有些凉意，但大部分人完全可以接受。
             * brf : 较舒适
             */

            private String txt;
            private String brf;

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

//            public static ComfEntity getComfEntityFromJson(JSONObject jsonObject){
            public static ComfEntity getComfEntityFromJson(JSONObject jsonObject){

                String txt = jsonObject.getString("txt");
                String brf = jsonObject.getString("brf");
                ComfEntity entity = new ComfEntity();
                entity.setTxt(txt);
                entity.setBrf(brf);
                return entity;
            }



//            }

        }

        public static class SportEntity {
            /**
             * txt : 有降水，推荐您在室内进行各种健身休闲运动，若坚持户外运动，须注意保暖并携带雨具。
             * brf : 较不宜
             */

            private String txt;
            private String brf;

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public static SportEntity getSportEntityFromJson(JSONObject jsonObject){

                String txt = jsonObject.getString("txt");
                String brf = jsonObject.getString("brf");

                SportEntity entity = new SportEntity();
                entity.setTxt(txt);
                entity.setBrf(brf);

                return entity;
            }


        }

        public static class FluEntity {
            /**
             * txt : 天气较凉，较易发生感冒，请适当增加衣服。体质较弱的朋友尤其应该注意防护。
             * brf : 较易发
             */

            private String txt;
            private String brf;

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public static FluEntity getFluEntityFromJson(JSONObject jsonObject){

                String txt = jsonObject.getString("txt");
                String brf = jsonObject.getString("brf");

                FluEntity entity = new FluEntity();
                entity.setTxt(txt);
                entity.setBrf(brf);

                return entity;
            }

        }

//        private UvEntity uv;//紫外线
//        private CwEntity cw;//洗车指数
//        private DrsEntity drs;//穿衣指数
//        private TravEntity trav;//旅游指数
//        private AirEntity air;//空气质量指数
//        private ComfEntity comf;//s舒适度指数
//        private SportEntity sport;//运动指数
//        private FluEntity flu;//感冒指数


        public static SuggestionEntity getSuggestionFromJson(JSONObject jsonObject){

            JSONObject uvJson = jsonObject.getJSONObject("uv");
            JSONObject cwjson = jsonObject.getJSONObject("cw");
            JSONObject drsJson = jsonObject.getJSONObject("drs");
            JSONObject travjson = jsonObject.getJSONObject("trav");
            JSONObject airjson = jsonObject.getJSONObject("air");
            JSONObject comfjson = jsonObject.getJSONObject("comf");
            JSONObject sportjson = jsonObject.getJSONObject("sport");
            JSONObject flujson = jsonObject.getJSONObject("flu");

            UvEntity uvEntity = UvEntity.getUvEntityFromJson(uvJson);
            CwEntity cwEntity = CwEntity.getCwEntityFromJson(cwjson);
            DrsEntity drsEntity = DrsEntity.getDrsEntityFromJson(drsJson);
            TravEntity travEntity = TravEntity.getTravEntityFromJson(travjson);
            AirEntity airEntity = AirEntity.getAirEntityFromJson(airjson);
            ComfEntity comfEntity = ComfEntity.getComfEntityFromJson(comfjson);
            SportEntity sportEntity = SportEntity.getSportEntityFromJson(sportjson);
            FluEntity fluEntity = FluEntity.getFluEntityFromJson(flujson);

            SuggestionEntity suggestionEntity = new SuggestionEntity();
            suggestionEntity.setUv(uvEntity);
            suggestionEntity.setCw(cwEntity);
            suggestionEntity.setDrs(drsEntity);
            suggestionEntity.setTrav(travEntity);
            suggestionEntity.setAir(airEntity);
            suggestionEntity.setComf(comfEntity);
            suggestionEntity.setSport(sportEntity);
            suggestionEntity.setFlu(fluEntity);

            return suggestionEntity;

        }

    }

//    @JSONField(name = "rcode")
//    private int requestCode;//结果吗
//    private String updatetime;
//    private String requestDesc;//结果描述
//    private SuggestionEntity suggestion;//生活指数
//    private String cityId;//城市ID
//    private String cityName;//城市名
//    private List<ForecastEntity> forecasts;//天气预报

    public static EnvironmentCloudForecast getEnvironmentCloudForecastFromJson(JSONObject forecastJson){

        EnvironmentCloudForecast forecast = new EnvironmentCloudForecast();
//        JSONObject forecastJson = RequestHelper.httpRequest("http://service.envicloud.cn:8082/v2/weatherforecast/YMFYB256AGFUZZE0ODQ3MZM1MZE2NTU=/101020100","GET");
        String cityId = forecastJson.getString("citycode");
        String requestDesc = forecastJson.getString("rdesc");
        int requestCode = forecastJson.getInt("rcode");
        String cityName = forecastJson.getString("cityname");
        JSONObject suggestionJson = forecastJson.getJSONObject("suggestion");
        SuggestionEntity suggestionEntity = null;
        try{
            suggestionEntity = SuggestionEntity.getSuggestionFromJson(suggestionJson);
        }catch (Exception e){
            System.out.println("suggestionJson = " + suggestionJson);
        }
//        JSONObject forecastsJson = forecastJson.getJSONObject("forecast");
        JSONArray forecastarray = forecastJson.getJSONArray("forecast");
        List<ForecastEntity> forecastEntities = new ArrayList<>();
        for (int i = 0; i < forecastarray.size(); i++) {
//            ForecastEntity forecastentity = new ForecastEntity();
            JSONObject forecastjson = forecastarray.getJSONObject(i);
            ForecastEntity forecastentity = ForecastEntity.getForecastEntityFromJson(forecastjson);
            forecastEntities.add(forecastentity);
         }

        forecast.setCityId(cityId);
        forecast.setRequestDesc(requestDesc);
        forecast.setRequestCode(requestCode);
        forecast.setCityName(cityName);
        forecast.setSuggestion(suggestionEntity);
        forecast.setForecasts(forecastEntities);

        return forecast;

    }

}
