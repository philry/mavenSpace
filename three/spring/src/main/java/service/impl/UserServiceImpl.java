package service.impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import service.UserService;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/14 15:01
 * Description:
 * version:1.0
 */
public class UserServiceImpl implements UserService {

//    private UserDao userDao = new UserDaoImpl();
//    private UserDao userDao = ObjectFactory.getObject("userDao");
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void regist() {
        userDao.insert();
    }
}
