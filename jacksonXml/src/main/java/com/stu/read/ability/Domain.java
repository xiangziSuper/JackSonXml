package com.stu.read.ability;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

/**
 * @Author liuwenxiang
 * @Date 2020-03-24
 * @Description
 */
public class Domain {

    private String domain;

    @JacksonXmlElementWrapper(localName = "clientServiceTypeList")
    @JacksonXmlProperty(localName = "clientServiceType")
    private List<ClientServiceTypeXml> clientServiceTypeXmlList;

    @JacksonXmlProperty(localName = "nextHop")
    private List<NextHopXml> nextHopListXml;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public List<ClientServiceTypeXml> getClientServiceTypeXmlList() {
        return clientServiceTypeXmlList;
    }

    public void setClientServiceTypeXmlList(List<ClientServiceTypeXml> clientServiceTypeXmlList) {
        this.clientServiceTypeXmlList = clientServiceTypeXmlList;
    }

    public List<NextHopXml> getNextHopListXml() {
        return nextHopListXml;
    }

    public void setNextHopListXml(List<NextHopXml> nextHopListXml) {
        this.nextHopListXml = nextHopListXml;
    }
}
