package ioc01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/14 16:06
 * Description:
 * version:1.0
 */
public class Test {

    public static void main(String[] args) {
//        SomeBean someBean = new SomeBean();
//        System.out.println(someBean.getId());

        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc01/applicationContext.xml");
        SomeBean someBean = (SomeBean) ac.getBean("someBean");
        System.out.println(someBean.getId());
        System.out.println(someBean.getName());
        System.out.println(someBean.getC());

    }

}
