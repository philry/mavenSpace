package ioc13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/15 14:58
 * Description:
 * version:1.0
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc13/applicationContext.xml");


        System.out.println(ac);

        SomeBean someBean = (SomeBean) ac.getBean("someBean");
        someBean.doSome();

    }

}
