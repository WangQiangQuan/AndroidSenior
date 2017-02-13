package com.qiang.senior.ystenbasemoudule.xml;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.XppDriver;
import com.thoughtworks.xstream.mapper.MapperWrapper;

import java.io.InputStream;

/**
 * Created by wangQ
 * on 2017/2/13.
 */

public class XmlMananger {
    /** xmlMapper对象，采用XStream解析 **/
    private XStream xmlMapper;
    /** XmlMananger实例对象 **/
    private static XmlMananger instance;

    private XmlMananger() {
        if (xmlMapper == null) {
            xmlMapper = new XStream(new XppDriver()) {
                @Override
                protected MapperWrapper wrapMapper(MapperWrapper next) {
                    return new MapperWrapper(next) {
                        @SuppressWarnings("rawtypes")
                        @Override
                        public boolean shouldSerializeMember(Class definedIn, String fieldName) {
                            if (definedIn == Object.class) {
                                return false;
                            }
                            return super.shouldSerializeMember(definedIn, fieldName);
                        }
                    };
                }
            };
            xmlMapper.autodetectAnnotations(true);
        }
    }

    /**
     * 得到单例模式XmlMananger对象
     *
     * @return
     */
    public static XmlMananger getInstance() {
        if (instance == null) {
            synchronized (XmlMananger.class) {
                if (instance == null) {
                    instance = new XmlMananger();
                }
            }
        }
        return instance;
    }

    /**
     * 将xml转化成java对象
     * @param xml
     * @param cls
     * @return
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public <T> T xmlToBean(String xml, Class<T> cls) throws Exception {
        try {
            xmlMapper.processAnnotations(cls);
            T obj = (T) xmlMapper.fromXML(xml);
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }
    /**
     * 将xml流对象转化成java对象
     * @param xml
     * @param cls
     * @return
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public <T> T xmlToBean(InputStream xml, Class<T> cls) throws Exception {
        try {
            xmlMapper.processAnnotations(cls);
            T obj = (T) xmlMapper.fromXML(xml);
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }

    /**
     * 将java对象转化成xml
     * @param  obj
     * @return
     * @throws Exception
     */
    public String beanToXml(Object obj) throws Exception {
        try {
            return xmlMapper.toXML(obj);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }

    /**
     * 得到XStream解析对象
     * @return
     */
    public XStream getXmlMapper() {
        return xmlMapper;
    }
}
