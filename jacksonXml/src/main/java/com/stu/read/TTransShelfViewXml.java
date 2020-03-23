package com.stu.read;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class TTransShelfViewXml implements Serializable {
    private String shelfViewId;
    private String manufacturer;
    private String shelfType;
    private String slotNo;
    private Integer slotNoHex;
    private Integer xPos;
    private Integer yPos;
    private Integer width;
    private Integer high;
    private Integer postType;
    private Date insertTime;
    private Date updateTime;
    private String neModel;

    private Integer shelfLocation;

    @JacksonXmlProperty(localName = "shelfLocation")
    private String shelfLocationCn;

    private String emsId;

    @JacksonXmlElementWrapper(localName = "slotList")
    @JacksonXmlProperty(localName = "slot")
    List<SlotViewXml> slotViewXmlList;

    public String getShelfLocationCn() {
        return shelfLocationCn;
    }

    public void setShelfLocationCn(String shelfLocationCn) {
        this.shelfLocationCn = shelfLocationCn;
    }

    public List<SlotViewXml> getSlotViewXmlList() {
        return slotViewXmlList;
    }

    public void setSlotViewXmlList(List<SlotViewXml> slotViewXmlList) {
        this.slotViewXmlList = slotViewXmlList;
    }

    private static final long serialVersionUID = 1L;

    public String getShelfViewId() {
        return shelfViewId;
    }

    public void setShelfViewId(String shelfViewId) {
        this.shelfViewId = shelfViewId;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getShelfType() {
        return shelfType;
    }

    public void setShelfType(String shelfType) {
        this.shelfType = shelfType;
    }

    public String getSlotNo() {
        return slotNo;
    }

    public void setSlotNo(String slotNo) {
        this.slotNo = slotNo;
    }

    public Integer getSlotNoHex() {
        return slotNoHex;
    }

    public void setSlotNoHex(Integer slotNoHex) {
        this.slotNoHex = slotNoHex;
    }

    public Integer getxPos() {
        return xPos;
    }

    public void setxPos(Integer xPos) {
        this.xPos = xPos;
    }

    public Integer getyPos() {
        return yPos;
    }

    public void setyPos(Integer yPos) {
        this.yPos = yPos;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHigh() {
        return high;
    }

    public void setHigh(Integer high) {
        this.high = high;
    }

    public Integer getPostType() {
        return postType;
    }

    public void setPostType(Integer postType) {
        this.postType = postType;
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

    public String getNeModel() {
        return neModel;
    }

    public void setNeModel(String neModel) {
        this.neModel = neModel;
    }

    public Integer getShelfLocation() {
        return shelfLocation;
    }

    public void setShelfLocation(Integer shelfLocation) {
        this.shelfLocation = shelfLocation;
    }

    public String getEmsId() {
        return emsId;
    }

    public void setEmsId(String emsId) {
        this.emsId = emsId;
    }
}