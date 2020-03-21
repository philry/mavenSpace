package ioc7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Timestamp;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        ApplicationContext ac=new ClassPathXmlApplicationContext("ioc7/applicationContext.xml");
        SomeService someService = (SomeService) ac.getBean("someService");
        System.out.println(someService);
        someService.doSome();

        Date date= (Date) ac.getBean("date");
        String  format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);

        System.out.println(date);
        System.out.println(format);
    }
}
