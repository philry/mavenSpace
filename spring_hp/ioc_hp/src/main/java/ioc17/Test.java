package ioc17;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("ioc17/applicationContext.xml");
        User user= (User) ac.getBean("user");
        System.out.println(user);
    }
}
