package ioc08;

import javafx.application.Application;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/15 11:28
 * Description:
 * version:1.0
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ioc08/applicationContext.xml");

//        SomeBean someBean = (SomeBean) ac.getBean("someBean");
        //此时我们发现我并没有获取对象SomeBean,但是在我解析对应的xml文件的时候
        //该对象已经被创建了
        //因此该对象在解析IOC容器的同时就已经实例化了
        //预先实例化


//        Resource resource = new ClassPathResource("ioc08/applicationContext.xml");
//        BeanFactory bf = new XmlBeanFactory(resource);
//        SomeBean someBean = (SomeBean) bf.getBean("someBean");
        //此时我们发现当解析xml的时候并没有构建对象的SomeBean对象
        //延迟实例化


    }

}
