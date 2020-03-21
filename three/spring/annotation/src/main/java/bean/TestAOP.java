package bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/19 15:18
 * Description:
 * version:1.0
 */
public class TestAOP {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        SomeBean someBean = (SomeBean) ac.getBean("someBean");
        someBean.doOther();


    }

}
