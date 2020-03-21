package ioc2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("ioc2/applicationContext.xml");
        SomeBean someBean= (SomeBean) ac.getBean("SomeBean");
        System.out.println(someBean.getAge());
        System.out.println(someBean.getOtherBean().getId());
        System.out.println(someBean.getOtherBean().getName());
    }
}
