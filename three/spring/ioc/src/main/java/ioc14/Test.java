package ioc14;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/15 15:51
 * Description:
 * version:1.0
 */
public class Test {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, ParseException {
//        SAXParserFactory factory = SAXParserFactory.newInstance();
//        SAXParser parser = factory.newSAXParser();
        //通过FactoryBean实现这个过程

        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc14/applicationContext.xml");
//
//        SAXParser parser = (SAXParser) ac.getBean("parser");
//        System.out.println(parser);



        //练习
//        Date date = new SimpleDateFormat("yyyyMMdd").parse("2018"+"01"+"01");
        Date date = (Date) ac.getBean("date");
        System.out.println(date);

    }

}
