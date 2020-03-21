package ioc13;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/15 14:57
 * Description:
 * version:1.0
 */
public class SomeBean implements ApplicationContextAware {

    private ApplicationContext ac;


    public void doSome(){
//        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc13/applicationContext.xml");
        System.out.println("doSome ac:"+ac);
        //此时发现取出来的容器与使用的容器并不是同一个
        //此处通过new出来的是一个新的容器，并不是原来的
        //那怎样才能取出与使用的容器一致的对象
    }

    public void setApplicationContext(ApplicationContext ac) throws BeansException {
        this.ac=ac;
    }
}
