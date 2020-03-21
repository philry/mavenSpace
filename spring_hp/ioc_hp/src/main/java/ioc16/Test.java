package ioc16;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("ioc16/applicationContext.xml");
        SomeBean someBean= (SomeBean) ac.getBean("someBean");
        System.out.println("name:"+someBean.getName()+"---"+"password:"+someBean.getPassword());
    }
}
