package test;

import dao.UserMapper;
import entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/20 13:45
 * Description:
 * version:1.0
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserMapper userMapper = (UserMapper) ac.getBean("userMapper");

        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user);



    }

}
