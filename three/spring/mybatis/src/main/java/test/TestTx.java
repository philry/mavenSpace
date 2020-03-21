package test;

import entity.User;
import exception.UserNotExistsException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/20 15:08
 * Description:
 * version:1.0
 */
public class TestTx {

    public static void main(String[] args) throws UserNotExistsException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = (UserService) ac.getBean("userServiceImpl");
        System.out.println(userService);

//        User user = new User();
//        user.setUsername("lisi");
//        user.setPassword("123456");
//        user.setPhone("13912345678");
//        user.setAddress("江苏-南京");
//        userService.regist(user);


        User user = userService.login("admin","123");
        System.out.println(user);


    }

}
