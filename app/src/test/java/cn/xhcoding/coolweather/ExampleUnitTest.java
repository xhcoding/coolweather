package cn.xhcoding.coolweather;

import org.junit.Test;

import cn.xhcoding.coolweather.fastjson.Weather;
import cn.xhcoding.coolweather.util.Utility;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testHandleWeatherResponse() {
        String responseText = "{\"HeWeather\": [{\"aqi\":{\"city\":{\"aqi\":\"74\",\"co\":\"1.0\",\"no2\":\"51\",\"o3\":\"16\",\"pm10\":\"78\",\"pm25\":\"54\",\"qlty\":\"良\",\"so2\":\"11\"}},\"basic\":{\"city\":\"江宁\",\"cnty\":\"中国\",\"id\":\"CN101190104\",\"lat\":\"31.95341873\",\"lon\":\"118.85062408\",\"update\":{\"loc\":\"2017-11-17 09:47\",\"utc\":\"2017-11-17 01:47\"}},\"daily_forecast\":[{\"astro\":{\"mr\":\"05:08\",\"ms\":\"16:36\",\"sr\":\"06:35\",\"ss\":\"17:06\"},\"cond\":{\"code_d\":\"305\",\"code_n\":\"305\",\"txt_d\":\"小雨\",\"txt_n\":\"小雨\"},\"date\":\"2017-11-17\",\"hum\":\"87\",\"pcpn\":\"2.2\",\"pop\":\"65\",\"pres\":\"1018\",\"tmp\":{\"max\":\"17\",\"min\":\"8\"},\"uv\":\"1\",\"vis\":\"15\",\"wind\":{\"deg\":\"64\",\"dir\":\"东北风\",\"sc\":\"3-4\",\"spd\":\"25\"}},{\"astro\":{\"mr\":\"06:03\",\"ms\":\"17:13\",\"sr\":\"06:36\",\"ss\":\"17:05\"},\"cond\":{\"code_d\":\"101\",\"code_n\":\"101\",\"txt_d\":\"多云\",\"txt_n\":\"多云\"},\"date\":\"2017-11-18\",\"hum\":\"56\",\"pcpn\":\"0.0\",\"pop\":\"0\",\"pres\":\"1029\",\"tmp\":{\"max\":\"10\",\"min\":\"3\"},\"uv\":\"3\",\"vis\":\"19\",\"wind\":{\"deg\":\"53\",\"dir\":\"东北风\",\"sc\":\"3-4\",\"spd\":\"17\"}},{\"astro\":{\"mr\":\"06:57\",\"ms\":\"17:52\",\"sr\":\"06:37\",\"ss\":\"17:05\"},\"cond\":{\"code_d\":\"101\",\"code_n\":\"305\",\"txt_d\":\"多云\",\"txt_n\":\"小雨\"},\"date\":\"2017-11-19\",\"hum\":\"52\",\"pcpn\":\"0.0\",\"pop\":\"0\",\"pres\":\"1028\",\"tmp\":{\"max\":\"11\",\"min\":\"7\"},\"uv\":\"4\",\"vis\":\"20\",\"wind\":{\"deg\":\"90\",\"dir\":\"东风\",\"sc\":\"微风\",\"spd\":\"5\"}}],\"now\":{\"cond\":{\"code\":\"104\",\"txt\":\"阴\"},\"fl\":\"15\",\"hum\":\"93\",\"pcpn\":\"0\",\"pres\":\"1015\",\"tmp\":\"15\",\"vis\":\"10\",\"wind\":{\"deg\":\"31\",\"dir\":\"东北风\",\"sc\":\"微风\",\"spd\":\"8\"}},\"status\":\"ok\",\"suggestion\":{\"air\":{\"brf\":\"良\",\"txt\":\"气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。\"},\"comf\":{\"brf\":\"舒适\",\"txt\":\"白天不太热也不太冷，风力不大，相信您在这样的天气条件下，应会感到比较清爽和舒适。\"},\"cw\":{\"brf\":\"不宜\",\"txt\":\"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。\"},\"drsg\":{\"brf\":\"较冷\",\"txt\":\"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。\"},\"flu\":{\"brf\":\"易发\",\"txt\":\"天冷风力较大且昼夜温差也很大，易发生感冒，请注意适当增减衣服。\"},\"sport\":{\"brf\":\"较不宜\",\"txt\":\"有降水，且风力较强，气压较低，推荐您在室内进行低强度运动；若坚持户外运动，须注意避雨防风。\"},\"trav\":{\"brf\":\"适宜\",\"txt\":\"有降水，虽然风稍大，但温度适宜，适宜旅游，可不要错过机会呦！\"},\"uv\":{\"brf\":\"最弱\",\"txt\":\"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。\"}}}]}";
        Weather weather = Utility.handleWeatherResponse(responseText);
        assertEquals("江宁", weather.basic.cityName);
    }
}