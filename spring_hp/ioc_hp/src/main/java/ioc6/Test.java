package ioc6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac= new ClassPathXmlApplicationContext("ioc6/applicationContext.xml");
        /*SomeService someService= (SomeService) ac.getBean("someService");
        System.out.println(someService);*/

        String javaHome=System.getenv("JAVA_HOME");
        System.out.println(javaHome);

        String javaHome2= (String) ac.getBean("jh");
        System.out.println(javaHome2);

    }
}
