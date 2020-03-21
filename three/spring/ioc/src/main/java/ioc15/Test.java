package ioc15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/16 9:11
 * Description:
 * version:1.0
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc15/applicationContext.xml");

        SomeBean someBean = (SomeBean) ac.getBean("someBean");
        System.out.println("someBean:"+someBean.getName());


        OtherBean otherBean = (OtherBean) ac.getBean("otherBean");
        System.out.println("otherBean:"+otherBean.getName());

//        System.out.println(ac.getBean("someBean"));
//        System.out.println(ac.getBean("otherBean"));

    }

}
