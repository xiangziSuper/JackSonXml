package com.stu.read.ability;

/**
 * @Author liuwenxiang
 * @Date 2020-03-24
 * @Description
 */
public class FixedBindingTPXml {

    private String bindingsour;
    private String bindingTpRef;
    private String layeRate;
    private String supportBindingServcieType;
    private String max_total;

    public FixedBindingTPXml() {
    }

    public String getLayeRate() {
        return this.layeRate;
    }

    public void setLayeRate(String layeRate) {
        this.layeRate = layeRate;
    }

    public String getBindingsour() {
        return this.bindingsour;
    }

    public void setBindingsour(String bindingsour) {
        this.bindingsour = bindingsour;
    }

    public String getBindingTpRef() {
        return this.bindingTpRef;
    }

    public void setBindingTpRef(String bindingTpRef) {
        this.bindingTpRef = bindingTpRef;
    }

    public String getSupportBindingServcieType() {
        return this.supportBindingServcieType;
    }

    public void setSupportBindingServcieType(String supportBindingServcieType) {
        this.supportBindingServcieType = supportBindingServcieType;
    }

    public String getMax_total() {
        return this.max_total;
    }

    public void setMax_total(String max_total) {
        this.max_total = max_total;
    }


}
