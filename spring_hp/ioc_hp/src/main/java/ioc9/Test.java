package ioc9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac= new ClassPathXmlApplicationContext("ioc9/applicationContext.xml");
        SomeBean someBean= (SomeBean) ac.getBean("someBean");
        SomeBean someBean1= (SomeBean) ac.getBean("someBean");
        SomeBean someBean2= (SomeBean) ac.getBean("someBean");
        System.out.println(someBean);
        System.out.println(someBean1);
        System.out.println(someBean2);
    }
}
