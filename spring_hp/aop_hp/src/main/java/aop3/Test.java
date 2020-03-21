package aop3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac= new ClassPathXmlApplicationContext("aop3/applicationContext.xml");
        SomeService someService= (SomeService) ac.getBean("someService");
        someService.doSome();
        someService.doOther();
    }
}
