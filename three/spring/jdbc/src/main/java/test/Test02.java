package test;

import dao.UserDao;
import entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/20 10:31
 * Description:
 * version:1.0
 */
public class Test02 {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserDao userDao = (UserDao) ac.getBean("userDao2");

        User user = new User();
        user.setUsername("zhangsan");
        user.setPassword("123456");
        user.setPhone("13812345678");
        user.setAddress("江苏-南京");

//        userDao.insertUser(user);

//        Long id = userDao.insertUserReturnPrimaryKey(user);
//        System.out.println(id);
        userDao.insertUser(user);


    }

}
