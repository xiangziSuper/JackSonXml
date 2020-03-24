package com.stu.read.ability;

/**
 * @Author liuwenxiang
 * @Date 2020-03-24
 * @Description
 */
public class NextHopXml {
    private String nextHop;
    private String isFixedXC;

    private String domain;

    public NextHopXml() {
    }

    public String getNextHop() {
        return this.nextHop;
    }

    public void setNextHop(String nextHop) {
        this.nextHop = nextHop;
    }

    public String getIsFixedXC() {
        return this.isFixedXC;
    }

    public void setIsFixedXC(String isFixedXC) {
        this.isFixedXC = isFixedXC;
    }

    public String getDomain() {
        return this.domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }


}
