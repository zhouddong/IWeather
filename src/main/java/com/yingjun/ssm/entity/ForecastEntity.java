package com.yingjun.ssm.entity;

import com.sun.tools.javac.util.List;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/4/8.
 */
public class ForecastEntity {
    /**
     * pop : 0
     * date : 2017-02-16
     * uv : 5
     * vis : 10
     * hum : 74
     * astro : {"ss":"17:42","mr":"22:42","ms":"09:41","sr":"06:34"}
     * pres : 1020
     * pcpn : 0.0
     * tmp : {"min":"10","max":"19"}
     * cond : {"cond_d":"小雨","cond_n":"阴"}
     * wind : {"sc":"微风","spd":"4","deg":"204","dir":"南风"}
     */

    private String pop;//降水概率(%)
    private String date;//预报日期
    private String uv;//紫外线级别
    private String vis;//能见度(km)
    private String hum;//相对湿度(%)
    private AstroEntity astro;//天文数据
    private String pres;//气压(hPa)
    private String pcpn;//降水量(mm)
    private TmpEntity tmp;//气温
    private CondEntity cond;//天气现象
    private WindEntity wind;//风力风向数据
//    private EnvironmentCloudForecast forecast;

//    public EnvironmentCloudForecast getForecast() {
//        return forecast;
//    }
//
//    public void setForecasts(EnvironmentCloudForecast forecast) {
//        this.forecast = forecast;
//    }

    public String getPop() {
        return pop;
    }

    public void setPop(String pop) {
        this.pop = pop;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUv() {
        return uv;
    }

    public void setUv(String uv) {
        this.uv = uv;
    }

    public String getVis() {
        return vis;
    }

    public void setVis(String vis) {
        this.vis = vis;
    }

    public String getHum() {
        return hum;
    }

    public void setHum(String hum) {
        this.hum = hum;
    }

    public AstroEntity getAstro() {
        return astro;
    }

    public void setAstro(AstroEntity astro) {
        this.astro = astro;
    }

    public String getPres() {
        return pres;
    }

    public void setPres(String pres) {
        this.pres = pres;
    }

    public String getPcpn() {
        return pcpn;
    }

    public void setPcpn(String pcpn) {
        this.pcpn = pcpn;
    }

    public TmpEntity getTmp() {
        return tmp;
    }

    public void setTmp(TmpEntity tmp) {
        this.tmp = tmp;
    }

    public CondEntity getCond() {
        return cond;
    }

    public void setCond(CondEntity cond) {
        this.cond = cond;
    }

    public WindEntity getWind() {
        return wind;
    }

    public void setWind(WindEntity wind) {
        this.wind = wind;
    }

    public static class AstroEntity {
        /**
         * ss : 17:42
         * mr : 22:42
         * ms : 09:41
         * sr : 06:34
         */

        private String ss;//日落时间
        private String mr;//月升
        private String ms;//月落
        private String sr;//日出时间

        public String getSs() {
            return ss;
        }

        public void setSs(String ss) {
            this.ss = ss;
        }

        public String getMr() {
            return mr;
        }

        public void setMr(String mr) {
            this.mr = mr;
        }

        public String getMs() {
            return ms;
        }

        public void setMs(String ms) {
            this.ms = ms;
        }

        public String getSr() {
            return sr;
        }

        public void setSr(String sr) {
            this.sr = sr;
        }

        public static AstroEntity getAstroEntityFromJson(JSONObject jsonObject){

            String ss = jsonObject.getString("ss");
            String mr = jsonObject.getString("mr");
            String ms = jsonObject.getString("ms");
            String sr = jsonObject.getString("sr");

            AstroEntity astroEntity = new AstroEntity();
            astroEntity.setSs(ss);
            astroEntity.setSr(sr);
            astroEntity.setMr(mr);
            astroEntity.setMs(ms);

            return astroEntity;

        }

    }

    public static class TmpEntity {
        /**
         * min : 10
         * max : 19
         */

        private String min;//最低气温(℃)
        private String max;//最高气温(℃)

        public String getMin() {
            return min;
        }

        public void setMin(String min) {
            this.min = min;
        }

        public String getMax() {
            return max;
        }

        public void setMax(String max) {
            this.max = max;
        }

        public static TmpEntity getTmpEntityFromJson(JSONObject jsonObject){

            String min = jsonObject.getString("min");
            String max = jsonObject.getString("max");

            TmpEntity tmpEntity = new TmpEntity();
            tmpEntity.setMax(max);
            tmpEntity.setMin(min);

            return tmpEntity;

        }

    }

    public static class CondEntity {
        /**
         * cond_d : 小雨
         * cond_n : 阴
         */

        private String cond_d;//白天天气现象
        private String cond_n;//夜间天气现象

        public String getCond_d() {
            return cond_d;
        }

        public void setCond_d(String cond_d) {
            this.cond_d = cond_d;
        }

        public String getCond_n() {
            return cond_n;
        }

        public void setCond_n(String cond_n) {
            this.cond_n = cond_n;
        }

        public static CondEntity getCondEntityFromJson(JSONObject jsonObject){

            String cond_d = jsonObject.getString("cond_d");
            String cond_n = jsonObject.getString("cond_n");

            CondEntity condEntity = new CondEntity();
            condEntity.setCond_d(cond_d);
            condEntity.setCond_n(cond_n);

            return condEntity;

        }

    }

    public static class WindEntity {
        /**
         * sc : 微风
         * spd : 4
         * deg : 204
         * dir : 南风
         */

        private String sc;//风力
        private String spd;//风速(m/s)
        private String deg;//风向(360°)
        private String dir;//风向

        public String getSc() {
            return sc;
        }

        public void setSc(String sc) {
            this.sc = sc;
        }

        public String getSpd() {
            return spd;
        }

        public void setSpd(String spd) {
            this.spd = spd;
        }

        public String getDeg() {
            return deg;
        }

        public void setDeg(String deg) {
            this.deg = deg;
        }

        public String getDir() {
            return dir;
        }

        public void setDir(String dir) {
            this.dir = dir;
        }

        public static WindEntity getWindEntityFromJson(JSONObject jsonObject){

            String sc = jsonObject.getString("sc");
            String spd = jsonObject.getString("spd");
            String deg = jsonObject.getString("deg");
            String dir = jsonObject.getString("dir");

            WindEntity windEntity = new WindEntity();
            windEntity.setSc(sc);
//            windEntity.setSc("1-2");
            windEntity.setDeg(deg);
            windEntity.setSpd(spd);
            windEntity.setDir(dir);

            return windEntity;

        }

    }

    public static ForecastEntity getForecastEntityFromJson(JSONObject jsonObject){

        JSONObject windJson = jsonObject.getJSONObject("wind");
        WindEntity windEntity = WindEntity.getWindEntityFromJson(windJson);
        String hum = jsonObject.getString("hum");
        String pcpn = jsonObject.getString("pcpn");
        JSONObject astroJson = jsonObject.getJSONObject("astro");
        AstroEntity astroEntity = AstroEntity.getAstroEntityFromJson(astroJson);
        String uv = jsonObject.getString("uv");
        JSONObject tmpJson = jsonObject.getJSONObject("tmp");
        TmpEntity tmpEntity = TmpEntity.getTmpEntityFromJson(tmpJson);
        String pop = jsonObject.getString("pop");
        String date = jsonObject.getString("date");
        String pres = jsonObject.getString("pres");
        JSONObject condJson = jsonObject.getJSONObject("cond");
        CondEntity condEntity = CondEntity.getCondEntityFromJson(condJson);
        String vis = jsonObject.getString("vis");

        ForecastEntity forecastEntity = new ForecastEntity();
        forecastEntity.setWind(windEntity);
        forecastEntity.setHum(hum);
        forecastEntity.setPcpn(pcpn);
        forecastEntity.setAstro(astroEntity);
        forecastEntity.setUv(uv);
        forecastEntity.setTmp(tmpEntity);
        forecastEntity.setPop(pop);
        forecastEntity.setDate(date);
//        forecastEntity.setDate("2019-04-22");
        forecastEntity.setPres(pres);
        forecastEntity.setCond(condEntity);
        forecastEntity.setVis(vis);

        return forecastEntity;

    }

}

