package ioc1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("ioc1/applicationContext.xml");
        SomeBean someBean= (SomeBean) ac.getBean("SomeBean");
        System.out.println(someBean.getId());
        System.out.println(someBean.getName());
        System.out.println(someBean.getC());
    }
}
