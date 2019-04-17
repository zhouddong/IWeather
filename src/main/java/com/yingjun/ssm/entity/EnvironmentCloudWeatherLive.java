package com.yingjun.ssm.entity;
import com.alibaba.fastjson.annotation.JSONField;
import net.sf.json.JSONObject;

/**
 * 天气实况
 *
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 *         2017/2/16
 */
public class EnvironmentCloudWeatherLive {


    /**
     * airpressure : 1016.0
     * rain : 0.0
     * windpower : 微风
     * rcode : 200
     * feelst : 17.7
     * citycode : 101020100
     * rdesc : Success
     * winddirect : 西北风
     * temperature : 17.8
     * humidity : 50.0
     * windspeed : 0.9
     * updatetime : 2017-02-16 14:06
     * phenomena : 阵雨
     */

    @JSONField(name = "rcode")
    private int requestCode;//结果吗

    @JSONField(name = "rdesc")
    private String requestDesc;//结果描述

    @JSONField(name = "updatetime")
    private String updateTime;//更新时间

    private String phenomena;//天气现象

    private String temperature;//气温(℃)

    @JSONField(name = "feelst")
    private String feelsTemperature;//体感温度(℃)

    @JSONField(name = "airpressure")
    private String airPressure;//气压(hPa)

    private String humidity;//相对湿度(%)

    private String rain;//降雨量(mm)

    @JSONField(name = "winddirect")
    private String windDirect;//风向

    @JSONField(name = "windpower")
    private String windPower;//风力

    @JSONField(name = "windspeed")
    private String windSpeed;//风速(m/s)

    @JSONField(name = "citycode")
    private String cityId;//城市ID

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

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getPhenomena() {
        return phenomena;
    }

    public void setPhenomena(String phenomena) {
        this.phenomena = phenomena;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getFeelsTemperature() {
        return feelsTemperature;
    }

    public void setFeelsTemperature(String feelsTemperature) {
        this.feelsTemperature = feelsTemperature;
    }

    public String getAirPressure() {
        return airPressure;
    }

    public void setAirPressure(String airPressure) {
        this.airPressure = airPressure;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getRain() {
        return rain;
    }

    public void setRain(String rain) {
        this.rain = rain;
    }

    public String getWindDirect() {
        return windDirect;
    }

    public void setWindDirect(String windDirect) {
        this.windDirect = windDirect;
    }

    public String getWindPower() {
        return windPower;
    }

    public void setWindPower(String windPower) {
        this.windPower = windPower;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public static EnvironmentCloudWeatherLive getWeatherLiveFromJson(JSONObject jsonObject){
//        private int requestCode;//结果吗
//        private String requestDesc;//结果描述
//        private String updateTime;//更新时间
//        private String phenomena;//天气现象
//        private String temperature;//气温(℃)
//        private String feelsTemperature;//体感温度(℃)
//        private String airPressure;//气压(hPa)
//        private String humidity;//相对湿度(%)
//        private String rain;//降雨量(mm)
//        private String windDirect;//风向
//        private String windPower;//风力
//        private String windSpeed;//风速(m/s)
//        private String cityId;//城市ID
//        {"windspeed":"0.4","citycode":"101020100","airpressure":"1015.0","phenomena":"晴",
//        "rdesc":"Success","humidity":"55.0","updatetime":"2019-04-13 17:05",
//        "windpower":"微风","feelst":"18.7","winddirect":"西北风","rcode":200,"rain":"0.0",
//        "temperature":"18.8"}
        EnvironmentCloudWeatherLive weatherLive = new EnvironmentCloudWeatherLive();
        int requestCode = jsonObject.getInt("rcode");
        String requestDesc = jsonObject.getString("rdesc");
        String updateTime = jsonObject.getString("updatetime");
        String phenomena = jsonObject.getString("phenomena");
        String temperature = jsonObject.getString("temperature");
        String feelsTemperature = jsonObject.getString("feelst");
        String airPressure = jsonObject.getString("airpressure");
        String humidity = jsonObject.getString("humidity");
        String rain = jsonObject.getString("rain");
        String windDirect = jsonObject.getString("winddirect");
        String windPower = jsonObject.getString("windpower");
        String windSpeed = jsonObject.getString("windspeed");
        String cityId = jsonObject.getString("citycode");

        weatherLive.setRequestCode(requestCode);
        weatherLive.setRequestDesc(requestDesc);
        weatherLive.setPhenomena(phenomena);
        weatherLive.setTemperature(temperature);
        weatherLive.setFeelsTemperature(feelsTemperature);
        weatherLive.setAirPressure(airPressure);
        weatherLive.setHumidity(humidity);
        weatherLive.setRain(rain);
        weatherLive.setWindDirect(windDirect);
        weatherLive.setWindPower(windPower);
        weatherLive.setWindSpeed(windSpeed);
        weatherLive.setCityId(cityId);
        weatherLive.setUpdateTime(updateTime);

        return weatherLive;
    }
}


