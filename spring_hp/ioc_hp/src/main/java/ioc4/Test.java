package ioc4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("ioc4/applicationContext.xml");
       /* SomeBean someBean= (SomeBean) ac.getBean("someBean");
        someBean.a();
        someBean.b();*/
    //    ((ClassPathXmlApplicationContext)ac).destroy();
        ((ClassPathXmlApplicationContext) ac).registerShutdownHook();

        /*ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("ioc4/applicationContext.xml");
        ac.destroy();
    //    ac.registerShutdownHook();*/
        while(true){}
    }
}
