package bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/19 14:21
 * Description:
 * version:1.0
 */
public class Test {

    public static void main(String[] args) {
        //AnnotationConfigApplicationContextc参数是一个指定的包名
        //表示读取该包下的所有类中的注解
//        ApplicationContext ac = new AnnotationConfigApplicationContext("bean");

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");


        SomeBean someBean = (SomeBean) ac.getBean("someBean");

//        System.out.println(someBean.getOtherBean().getName());

//        System.out.println(someBean.getOb().getName());
    }

}
