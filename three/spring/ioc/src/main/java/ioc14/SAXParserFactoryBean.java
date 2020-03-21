package ioc14;

import org.springframework.beans.factory.FactoryBean;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/15 15:53
 * Description:
 * version:1.0
 */
public class SAXParserFactoryBean implements FactoryBean {
    /**
     * 创建某个对象的过程
     * @return
     * @throws Exception
     */
    public Object getObject() throws Exception {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        return parser;
    }

    /**
     * 创建的对象的类型
     * @return
     */
    public Class getObjectType() {
        return SAXParser.class;
    }

    /**
     * 该对象是否是单例的
     * @return
     */
    public boolean isSingleton() {
        return false;
    }
}
