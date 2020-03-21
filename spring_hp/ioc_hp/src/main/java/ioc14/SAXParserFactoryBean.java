package ioc14;

import org.springframework.beans.factory.FactoryBean;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SAXParserFactoryBean implements FactoryBean {
    public Object getObject() throws Exception {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser=factory.newSAXParser();
        return parser;
    }

    public Class<?> getObjectType() {
        return SAXParser.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
