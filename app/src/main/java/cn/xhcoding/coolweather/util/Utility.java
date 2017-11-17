package cn.xhcoding.coolweather.util;

import android.text.TextUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import cn.xhcoding.coolweather.db.City;
import cn.xhcoding.coolweather.db.County;
import cn.xhcoding.coolweather.db.Province;
import cn.xhcoding.coolweather.fastjson.Weather;

/**
 * Author: xhcoding
 * Date: 17-11-16
 */

public class Utility {

    /**
     * 处理服务器返回的省级数据
     *
     * @param response
     * @return
     */
    public static boolean handleProvinceResponse(String response) {
        if (!TextUtils.isEmpty(response)) {

            JSONArray allProvinces = JSONArray.parseArray(response);
            for (int i = 0; i < allProvinces.size(); i++) {
                JSONObject provinceObject = allProvinces.getJSONObject(i);
                Province province = new Province();
                province.setProvinceName(provinceObject.getString("name"));
                province.setProvinceCode(provinceObject.getInteger("id"));
                province.save();
            }
            return true;
        }
        return false;
    }

    public static boolean handleCityResponse(String response, int provinceId) {
        if (!TextUtils.isEmpty(response)) {
            JSONArray allCities = JSONArray.parseArray(response);
            for (int i = 0; i < allCities.size(); i++) {
                JSONObject cityObject = allCities.getJSONObject(i);
                City city = new City();
                city.setCityName(cityObject.getString("name"));
                city.setCityCode(cityObject.getInteger("id"));
                city.setProvinceId(provinceId);
                city.save();
            }
            return true;

        }
        return false;
    }

    public static boolean handleCountyResponse(String response, int cityId) {
        if (!TextUtils.isEmpty(response)) {
            JSONArray allCounties = JSONArray.parseArray(response);
            for (int i = 0; i < allCounties.size(); i++) {
                JSONObject countyObject = allCounties.getJSONObject(i);
                County county = new County();
                county.setCountyName(countyObject.getString("name"));
                county.setWeatherId(countyObject.getString("weather_id"));
                county.setCityId(cityId);
                county.save();
            }
            return true;
        }
        return false;
    }

    /**
     * 将返回的json数据解析成Weather实体类
     */

    public static Weather handleWeatherResponse(String response) {
        JSONObject jsonObject = JSONObject.parseObject(response);
        JSONArray jsonArray = jsonObject.getJSONArray("HeWeather");
        String weatherContent = jsonArray.getJSONObject(0).toString();
        return JSON.parseObject(weatherContent, Weather.class);
    }
}
