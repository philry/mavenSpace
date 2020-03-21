package ioc11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/15 14:14
 * Description:
 * version:1.0
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc11/applicationContext.xml");


        SomeBean someBean = (SomeBean) ac.getBean("someBean");
//        System.out.println(someBean.getOtherBean().getName());
        System.out.println(someBean.getOb().getName());
    }


}
