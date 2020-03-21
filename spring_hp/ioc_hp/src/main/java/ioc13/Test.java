package ioc13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc13/applicationContext.xml");
        System.out.println(ac);
        SomeBean someBean= (SomeBean) ac.getBean("someBean");
        someBean.doSome();
    }
}
