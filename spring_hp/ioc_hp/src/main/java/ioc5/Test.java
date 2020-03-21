package ioc5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("ioc5/applicationContext.xml");
        SomeBean someBean= (SomeBean) ac.getBean("someBean");
        System.out.println(someBean);
    }
}
