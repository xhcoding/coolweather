package cn.xhcoding.coolweather.fastjson;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Author: xhcoding
 * Date: 17-11-17
 */

public class Now {

    @JSONField(name = "tmp")
    public String temperature;

    @JSONField(name = "cond")
    public More more;

    public class More {
        @JSONField(name = "txt")
        public String info;
    }
}
