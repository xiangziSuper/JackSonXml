package com.stu.read;

import java.io.Serializable;
import java.util.Date;

public class TTransRackViewXml implements Serializable {
    private static final long serialVersionUID = 1L;
    private String rackViewId;
    private String manufacturer;
    private Integer rackSort;
    private Date insertTime;
    private Date updateTime;
    private String emsId;


    public String getRackViewId() {
        return rackViewId;
    }

    public void setRackViewId(String rackViewId) {
        this.rackViewId = rackViewId == null ? null : rackViewId.trim();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    public Integer getRackSort() {
        return rackSort;
    }

    public void setRackSort(Integer rackSort) {
        this.rackSort = rackSort;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getEmsId() {
        return emsId;
    }

    public void setEmsId(String emsId) {
        this.emsId = emsId == null ? null : emsId.trim();
    }
}