package service;

import entity.User;
import exception.UserNotExistsException;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/20 15:03
 * Description:
 * version:1.0
 */
public interface UserService {

    public void regist(User user);

    public User login(String username,String password) throws UserNotExistsException;

}
