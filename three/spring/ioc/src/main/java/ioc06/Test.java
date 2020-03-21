package ioc06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/15 10:20
 * Description:
 * version:1.0
 */
public class Test {

    public static void main(String[] args) {
//        SomeService someService = new SomeServiceImpl();
//        SomeService someService = SomeServiceFactory.getObject();
//        someService.doSome();
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc06/applicationContext.xml");

        SomeService someService = (SomeService) ac.getBean("someService");

        System.out.println(someService);



//        Map map = System.getenv();
//        System.out.println(map);
//
//        Map map2 = (Map) ac.getBean("env");
//        System.out.println(map2);


//        String javaHome = System.getenv("JAVA_HOME");
//        System.out.println(javaHome);

        String javaHome = (String) ac.getBean("javaHome");
        System.out.println(javaHome);



    }

}
