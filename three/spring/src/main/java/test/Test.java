package test;

import dao.impl.UserDaoImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import service.UserService;
import service.impl.UserServiceImpl;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/14 15:05
 * Description:
 * version:1.0
 */
public class Test {

    public static void main(String[] args) {
//        UserService userService = new UserServiceImpl();
//        userService.regist();


//        Resource resource = new ClassPathResource("applicationContext.xml");
//
//        BeanFactory bf = new XmlBeanFactory(resource);
//
//        UserService userService = (UserService) bf.getBean("userService");
//        System.out.println(userService);
//
//        userService.regist();


//        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml","applicationContext2.xml"});
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext*.xml");

        UserService userService = (UserService) ac.getBean("userService");
        userService.regist();


    }
}
