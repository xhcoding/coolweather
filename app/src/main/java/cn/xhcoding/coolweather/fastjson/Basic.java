package cn.xhcoding.coolweather.fastjson;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Author: xhcoding
 * Date: 17-11-17
 */

public class Basic {

    @JSONField(name = "city")
    public String cityName;

    @JSONField(name = "id")
    public String weatherId;


    public Update update;

    public class Update {
        @JSONField(name = "loc")
        public String updateTime;
    }
}
