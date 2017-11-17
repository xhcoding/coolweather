package cn.xhcoding.coolweather.fastjson;

/**
 * Author: xhcoding
 * Date: 17-11-17
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;

        public String pm25;
    }
}
