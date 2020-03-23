package com.stu.read;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

/**
 * @Author liuwenxiang
 * @Date 2020-03-23
 * @Description
 */
public class Main {
    public static void main(String[] args)throws Exception {
        InputStream resourceAsStream = Main.class.getClassLoader().getResourceAsStream("testRead.xml");
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.setDefaultUseWrapper(false);
        //字段为null，自动忽略，不再序列化
        xmlMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        //XML标签名:使用骆驼命名的属性名，
        //xmlMapper.setPropertyNamingStrategy(PropertyNamingStrategy.UPPER_CAMEL_CASE);
        //设置转换模式
        xmlMapper.enable(MapperFeature.USE_STD_BEAN_NAMING);
        //即标签多于类属性，反序列化时，若实体类没有对应的属性，是否抛出JsonMappingException异常，false忽略掉
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        XMLInputFactory factory = XMLInputFactory.newInstance();
        URL resource = Main.class.getClassLoader().getResource("testRead.xml");
        Reader reader = new FileReader(resource.getPath());
        Reader reader2 = new InputStreamReader(resourceAsStream, "UTF-8");

        try {

            XMLStreamReader streamReader =
                    factory.createXMLStreamReader(reader);
            System.out.println(xmlMapper.readValue(streamReader, Root.class));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("异常~~~~~~~~~~");
        }
    }
}
