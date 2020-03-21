package test;

import entity.User;
import exception.UserNotExistException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

public class TestTx {
    public static void main(String[] args) throws UserNotExistException {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService= (UserService) ac.getBean("userServiceImpl");
        User user=userService.login("admin","admin");
        System.out.println(user);
    }
}
