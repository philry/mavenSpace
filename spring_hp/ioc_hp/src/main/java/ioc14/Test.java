package ioc14;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.parsers.SAXParser;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        ApplicationContext ac=new ClassPathXmlApplicationContext("ioc14/applicationContext.xml");
        SAXParser parser= (SAXParser) ac.getBean("parser");
        System.out.println(parser);

        Date date= (Date) ac.getBean("date");
        String time=new SimpleDateFormat("yyyyMMdd").format(date);
        Date time2=new SimpleDateFormat("yyyy-MM-dd").parse("2018-01-01");
        System.out.println(date);
        System.out.println(time);
        System.out.println("---"+time2+"---");
    }
}
