package cn.xhcoding.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by xhcoding on 17-11-16.
 * 存放省的名称和对应的code
 */

public class Province extends DataSupport {
    private int id;

    private String provinceName;

    private String provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }
}
