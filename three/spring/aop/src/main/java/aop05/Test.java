package aop05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/19 13:37
 * Description:
 * version:1.0
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("aop05/applicationContext.xml");

        SomeService someService = (SomeService) ac.getBean("someService");

//        someService.doOther();

        someService.doSome("admin");


    }

}
