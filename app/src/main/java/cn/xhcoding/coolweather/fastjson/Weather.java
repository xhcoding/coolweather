package cn.xhcoding.coolweather.fastjson;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * Author: xhcoding
 * Date: 17-11-17
 */

public class Weather {
    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @JSONField(name = "daily_forecast")
    public List<Forecast> forecastList;
}
