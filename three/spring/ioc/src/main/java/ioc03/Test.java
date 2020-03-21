package ioc03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/14 16:20
 * Description:
 * version:1.0
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc03/applicationContext.xml");

        SomeBean someBean = (SomeBean) ac.getBean("someBean2");

        System.out.println(someBean);


    }

}
