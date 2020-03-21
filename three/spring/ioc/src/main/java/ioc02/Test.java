package ioc02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/14 16:13
 * Description:
 * version:1.0
 */
public class Test {


    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc02/applicationContext.xml");

        SomeBean someBean = (SomeBean) ac.getBean("someBean");

        System.out.println(someBean.getAge());
        System.out.println(someBean.getOtherBean().getId());
        System.out.println(someBean.getOtherBean().getName());


    }

}
