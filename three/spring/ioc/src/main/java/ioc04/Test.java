package ioc04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/15 9:07
 * Description:
 * version:1.0
 */
public class Test {

    public static void main(String[] args) {
//        new SomeBean();
//        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc04/applicationContext.xml");
//
//        SomeBean someBean = (SomeBean) ac.getBean("someBean");

        //对于销毁方法我们只能做建议
//        System.gc();
//        Runtime.getRuntime().gc();

//        someBean.a();
//        someBean.b();

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("ioc04/applicationContext.xml");

        SomeBean someBean = (SomeBean) ac.getBean("someBean");

        //主动销毁，当前容器销毁的时候回自动执行对应的销毁方法
        //        ac.destroy();
        //当虚拟机关闭的时候，销毁当前容器中所有的bean
        ac.registerShutdownHook();

        //        while(true){
        //
        //        }



    }

}
