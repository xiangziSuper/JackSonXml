package com.stu.read.ability;

import com.alibaba.fastjson.JSONObject;

/**
 * @Author liuwenxiang
 * @Date 2020-03-24
 * @Description
 */
public class FixedXCXml {

    private String aEndTP;
    private String zEndTP;
    private String layerRate;
    private String direction;

    public FixedXCXml() {
    }

    public String getaEndTP() {
        return this.aEndTP;
    }

    public void setaEndTP(String aEndTP) {
        this.aEndTP = aEndTP;
    }

    public String getzEndTP() {
        return this.zEndTP;
    }

    public void setzEndTP(String zEndTP) {
        this.zEndTP = zEndTP;
    }

    public String getLayerRate() {
        return this.layerRate;
    }

    public void setLayerRate(String layerRate) {
        this.layerRate = layerRate;
    }

    public String getDirection() {
        return this.direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
