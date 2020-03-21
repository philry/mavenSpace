package aop4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("aop4/applicationContext.xml");
        SomeService someService= (SomeService) ac.getBean("someService");
        OtherService otherService= (OtherService) ac.getBean("otherService");
        someService.doSome();
     //   someService.doOther();
     //   otherService.doSome();
     //   otherService.doOther();
    }
}
