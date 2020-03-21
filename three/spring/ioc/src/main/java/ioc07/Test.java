package ioc07;

import com.sun.xml.internal.messaging.saaj.soap.SOAPVersionMismatchException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;
import java.util.Date;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/15 11:19
 * Description:
 * version:1.0
 */
public class Test {

    public static void main(String[] args) {
//        SomeServiceFactory factory = new SomeServiceFactory();
//        SomeService someService = factory.getObject();
//        someService.doSome();

        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc07/applicationContext.xml");

        SomeService someService = (SomeService) ac.getBean("someService");

        someService.doSome();

//        Calendar calendar = Calendar.getInstance();
//        Date date = calendar.getTime();
//        System.out.println(date);


        Date date = (Date) ac.getBean("date");
        System.out.println(date);






    }

}
