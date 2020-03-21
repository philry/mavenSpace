package aop04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/19 10:44
 * Description:
 * version:1.0
 */
public class Test {

    public static void main(String[] args) throws SomeException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("aop04/applicationContext.xml");

        SomeService someService = (SomeService) ac.getBean("someService");
        OtherService otherService = (OtherService) ac.getBean("otherService");


//        someService.doSome();
//        someService.doOther();

        otherService.doSome();

//        otherService.doOther();

    }

}
