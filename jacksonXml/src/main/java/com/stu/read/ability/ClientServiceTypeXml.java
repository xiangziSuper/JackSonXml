package com.stu.read.ability;

/**
 * @Author liuwenxiang
 * @Date 2020-03-24
 * @Description
 */
public class ClientServiceTypeXml {
    private String clientType;
    private String clientServiceMappingMode;
    private String clientServiceContainer;
    private String clientServicePath;
    private String avaliableXCType;
    private String domain;

    public ClientServiceTypeXml() {
    }

    public String getClientType() {
        return this.clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getClientServiceMappingMode() {
        return this.clientServiceMappingMode;
    }

    public void setClientServiceMappingMode(String clientServiceMappingMode) {
        this.clientServiceMappingMode = clientServiceMappingMode;
    }

    public String getClientServiceContainer() {
        return this.clientServiceContainer;
    }

    public void setClientServiceContainer(String clientServiceContainer) {
        this.clientServiceContainer = clientServiceContainer;
    }

    public String getClientServicePath() {
        return this.clientServicePath;
    }

    public void setClientServicePath(String clientServicePath) {
        this.clientServicePath = clientServicePath;
    }

    public String getAvaliableXCType() {
        return this.avaliableXCType;
    }

    public void setAvaliableXCType(String avaliableXCType) {
        this.avaliableXCType = avaliableXCType;
    }

    public String getDomain() {
        return this.domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}
