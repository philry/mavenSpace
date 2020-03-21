package ioc15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("ioc15/applicationContext.xml");
        SomeBean someBean= (SomeBean) ac.getBean("someBean");
        System.out.println(someBean.getName());

        OtherBean otherBean = (OtherBean) ac.getBean("otherBean");
        System.out.println(otherBean.getName());
    }
}
