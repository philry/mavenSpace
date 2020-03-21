package ioc10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/15 13:40
 * Description:
 * version:1.0
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc10/applicationContext.xml");

//        SomeBean someBean = (SomeBean) ac.getBean("someBean");
//
//        OtherBean otherBean = (OtherBean) ac.getBean("otherBean");
//        System.out.println(someBean.getUsername()+"---"+someBean.getPassword());
//        System.out.println(otherBean.getUsername());


        SomeBean someBean1 = (SomeBean) ac.getBean("someBean1");
        SomeBean someBean2 = (SomeBean) ac.getBean("someBean2");
        SomeBean someBean3 = (SomeBean) ac.getBean("someBean3");
        System.out.println("someBean1:"+someBean1.getUsername()+"-"+someBean1.getPassword());
        System.out.println("someBean2:"+someBean2.getUsername()+"-"+someBean2.getPassword());
        System.out.println("someBean3:"+someBean3.getUsername()+"-"+someBean3.getPassword());


    }

}
