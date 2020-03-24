package com.stu.read.ability;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;
import java.util.Map;

/**
 * @Author liuwenxiang
 * @Date 2020-03-24
 * @Description
 */
@JacksonXmlRootElement(localName = "board_desc")
public class BoardDesc {

    private String manufacturer;

    private String neType;

    private String boardAliasName;

    private String boardTypeVersion;

    private String boardSupportDomianList;

    @JacksonXmlElementWrapper(localName = "FixedXCList")
    @JacksonXmlProperty(localName = "FixedXC")
    private List<FixedXCXml> fixedXCList;

    @JacksonXmlElementWrapper(localName = "FixedBindingTPList")
    private List<FixedBindingTPXml> fixedBindingTPList;

    @JacksonXmlElementWrapper(localName = "boardMaintenanceOperation")
    private Map<String, String> boardMaint;

    @JacksonXmlProperty(localName = "boardSupportPerformance")
    private BoardPMXml boardPMXml;

    @JacksonXmlProperty(localName = "portNo")
    private List<PortAbilityXml> portAbilityXmlList;

    public List<PortAbilityXml> getPortAbilityXmlList() {
        return portAbilityXmlList;
    }

    public void setPortAbilityXmlList(List<PortAbilityXml> portAbilityXmlList) {
        this.portAbilityXmlList = portAbilityXmlList;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getNeType() {
        return neType;
    }

    public void setNeType(String neType) {
        this.neType = neType;
    }

    public String getBoardAliasName() {
        return boardAliasName;
    }

    public void setBoardAliasName(String boardAliasName) {
        this.boardAliasName = boardAliasName;
    }

    public String getBoardTypeVersion() {
        return boardTypeVersion;
    }

    public void setBoardTypeVersion(String boardTypeVersion) {
        this.boardTypeVersion = boardTypeVersion;
    }

    public String getBoardSupportDomianList() {
        return boardSupportDomianList;
    }

    public void setBoardSupportDomianList(String boardSupportDomianList) {
        this.boardSupportDomianList = boardSupportDomianList;
    }

    public List<FixedXCXml> getFixedXCList() {
        return fixedXCList;
    }

    public void setFixedXCList(List<FixedXCXml> fixedXCList) {
        this.fixedXCList = fixedXCList;
    }

    public List<FixedBindingTPXml> getFixedBindingTPList() {
        return fixedBindingTPList;
    }

    public void setFixedBindingTPList(List<FixedBindingTPXml> fixedBindingTPList) {
        this.fixedBindingTPList = fixedBindingTPList;
    }

    public Map<String, String> getBoardMaint() {
        return boardMaint;
    }

    public void setBoardMaint(Map<String, String> boardMaint) {
        this.boardMaint = boardMaint;
    }

    public BoardPMXml getBoardPMXml() {
        return boardPMXml;
    }

    public void setBoardPMXml(BoardPMXml boardPMXml) {
        this.boardPMXml = boardPMXml;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
