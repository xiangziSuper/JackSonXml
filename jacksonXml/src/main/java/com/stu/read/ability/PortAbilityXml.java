package com.stu.read.ability;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;
import java.util.Map;

/**
 * @Author liuwenxiang
 * @Date 2020-03-24
 * @Description
 */
public class PortAbilityXml {

    private String portNo;

    private String tpType;

    private String isPortNeedCreate;

    @JacksonXmlProperty(localName = "domain")
    private Domain domain;

    @JacksonXmlElementWrapper(localName = "portMaintenanceOperation")
    private Map<String, String> portMaint;

    @JacksonXmlElementWrapper(localName = "tpSupportPerformanceList")
    @JacksonXmlProperty(localName = "tpSupportPerformance")
    private List<PortpmXml> portpmXmlList;

    private String port_ser_id;

    public PortAbilityXml() {
    }

    public String getPortNo() {
        return portNo;
    }

    public void setPortNo(String portNo) {
        this.portNo = portNo;
    }

    public String getTpType() {
        return tpType;
    }

    public void setTpType(String tpType) {
        this.tpType = tpType;
    }

    public String getIsPortNeedCreate() {
        return isPortNeedCreate;
    }

    public void setIsPortNeedCreate(String isPortNeedCreate) {
        this.isPortNeedCreate = isPortNeedCreate;
    }

    public Domain getDomain() {
        return domain;
    }

    public void setDomain(Domain domain) {
        this.domain = domain;
    }

    public Map<String, String> getPortMaint() {
        return portMaint;
    }

    public void setPortMaint(Map<String, String> portMaint) {
        this.portMaint = portMaint;
    }

    public List<PortpmXml> getPortpmXmlList() {
        return portpmXmlList;
    }

    public void setPortpmXmlList(List<PortpmXml> portpmXmlList) {
        this.portpmXmlList = portpmXmlList;
    }

    public String getPort_ser_id() {
        return port_ser_id;
    }

    public void setPort_ser_id(String port_ser_id) {
        this.port_ser_id = port_ser_id;
    }
}
