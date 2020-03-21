package service.impl;

import entity.User;
import exception.UserNotExistException;
import service.UserService;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/20 16:14
 * Description:
 * version:1.0
 */
public class UserServiceImpl implements UserService {
    @Override
    public User login(String username, String password) throws UserNotExistException {

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        if("admin".equals(username) && "123".equals(password)){
            return user;
        }
        throw new UserNotExistException("用户名或密码错误");
    }
}
