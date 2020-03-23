package com.stu.read;

import java.io.Serializable;
import java.util.Date;

public class TTransBoardViewXml implements Serializable {
    private String boardViewId;

    private String manufacturer;

    private String shelfType;

    private String boardModel;

    private String useSlotNum;

    private String useSlotList;

    private Date insertTime;

    private Date updateTime;

    private String neModle;

    private String emsId;

    private static final long serialVersionUID = 1L;

    public String getBoardViewId() {
        return boardViewId;
    }

    public void setBoardViewId(String boardViewId) {
        this.boardViewId = boardViewId == null ? null : boardViewId.trim();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    public String getShelfType() {
        return shelfType;
    }

    public void setShelfType(String shelfType) {
        this.shelfType = shelfType == null ? null : shelfType.trim();
    }

    public String getBoardModel() {
        return boardModel;
    }

    public void setBoardModel(String boardModel) {
        this.boardModel = boardModel == null ? null : boardModel.trim();
    }

    public String getUseSlotNum() {
        return useSlotNum;
    }

    public void setUseSlotNum(String useSlotNum) {
        this.useSlotNum = useSlotNum == null ? null : useSlotNum.trim();
    }

    public String getUseSlotList() {
        return useSlotList;
    }

    public void setUseSlotList(String useSlotList) {
        this.useSlotList = useSlotList == null ? null : useSlotList.trim();
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

    public String getNeModle() {
        return neModle;
    }

    public void setNeModle(String neModle) {
        this.neModle = neModle == null ? null : neModle.trim();
    }

    public String getEmsId() {
        return emsId;
    }

    public void setEmsId(String emsId) {
        this.emsId = emsId == null ? null : emsId.trim();
    }
}