package bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        SomeBean someBean= (SomeBean) ac.getBean("someBean");
     //   someBean.doSome();
        someBean.doOther();
    }
}
