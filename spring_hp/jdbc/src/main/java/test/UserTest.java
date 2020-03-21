package test;

import dao.UserDao;
import entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao= (UserDao) ac.getBean("userDao");
        User user=new User();
        user.setUsername("111");
        user.setPassword("111");
        user.setPhone("111");
        user.setAddress("111");
    //    userDao.insertUser(user);
    //    userDao.deleteById(4);
        Long id = userDao.insertUserReturnPrimaryKey(user);
        System.out.println(id);
    }
}
