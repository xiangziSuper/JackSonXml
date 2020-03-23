package com.stu.read;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

/**
 * @Author liuwenxiang
 * @Date 2020-03-23
 * @Description
 */
@JacksonXmlRootElement(localName = "root")
public class Root {
    @JacksonXmlElementWrapper(localName = "rackList")
    @JacksonXmlProperty(localName = "rack")
    List<TTransRackViewXml> tTransRackViewXmlList;

    @JacksonXmlElementWrapper(localName = "shelfList")
    @JacksonXmlProperty(localName = "shelf")
    List<TTransShelfViewXml> tTransShelfViewXmlList;

    @JacksonXmlElementWrapper(localName = "boardList")
    @JacksonXmlProperty(localName = "board")
    List<TTransBoardViewXml> tTransBoardViewXmlList;


    public List<TTransBoardViewXml> gettTransBoardViewXmlList() {
        return tTransBoardViewXmlList;
    }

    public void settTransBoardViewXmlList(List<TTransBoardViewXml> tTransBoardViewXmlList) {
        this.tTransBoardViewXmlList = tTransBoardViewXmlList;
    }

    public List<TTransRackViewXml> gettTransRackViewXmlList() {
        return tTransRackViewXmlList;
    }

    public void settTransRackViewXmlList(List<TTransRackViewXml> tTransRackViewXmlList) {
        this.tTransRackViewXmlList = tTransRackViewXmlList;
    }

    public List<TTransShelfViewXml> gettTransShelfViewXmlList() {
        return tTransShelfViewXmlList;
    }

    public void settTransShelfViewXmlList(List<TTransShelfViewXml> tTransShelfViewXmlList) {
        this.tTransShelfViewXmlList = tTransShelfViewXmlList;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
