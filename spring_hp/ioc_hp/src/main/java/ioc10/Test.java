package ioc10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("ioc10/applicationContext.xml");
        SomeBean someBean= (SomeBean) ac.getBean("someBean");
        OtherBean otherBean= (OtherBean) ac.getBean("otherBean");
        System.out.println(someBean.getUsername()+","+someBean.getPassword());
        System.out.println(otherBean.getUsername());
    }
}
