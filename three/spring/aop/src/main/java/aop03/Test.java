package aop03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/16 14:55
 * Description:
 * version:1.0
 */
public class Test {

    public static void main(String[] args) throws SomeException {
//        SomeService someService = new SomeServiceImpl();
        ApplicationContext ac = new ClassPathXmlApplicationContext("aop03/applicationContext.xml");
        SomeService someService = (SomeService) ac.getBean("someService");


//        someService.doSome();
//
//        someService.doOther();
        someService.login();

//        someService.regist();

    }

}
