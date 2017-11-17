package cn.xhcoding.coolweather.fastjson;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Author: xhcoding
 * Date: 17-11-17
 */

public class Suggestion {

    @JSONField(name = "comf")
    public Comfort comfort;

    @JSONField(name = "cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {
        @JSONField(name = "txt")
        public String info;
    }

    public class CarWash {
        @JSONField(name = "txt")
        public String info;
    }

    public class Sport {
        @JSONField(name = "txt")
        public String info;
    }
}
