package bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        ApplicationContext ac=new AnnotationConfigApplicationContext("bean");
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");

        OtherBean otherBean= (OtherBean) ac.getBean("ob");
        SomeBean someBean = (SomeBean) ac.getBean("someBean");
        System.out.println(someBean.getOb().getName());
    }
}
