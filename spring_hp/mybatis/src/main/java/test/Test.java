package test;

import dao.UserMapper;
import entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper usermapper= (UserMapper) ac.getBean("userMapper");
        User user = usermapper.selectByPrimaryKey(1);
        System.out.println(user);
    }
}
