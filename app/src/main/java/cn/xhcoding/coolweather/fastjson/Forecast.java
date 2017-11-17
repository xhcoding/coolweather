package cn.xhcoding.coolweather.fastjson;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Author: xhcoding
 * Date: 17-11-17
 */

public class Forecast {
    public String date;

    @JSONField(name = "tmp")
    public Temperature temperature;

    @JSONField(name = "cond")
    public More more;

    public class Temperature {
        public String max;

        public String min;
    }

    public class More {
        @JSONField(name = "txt_d")
        public String info;
    }
}
