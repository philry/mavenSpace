package service;

import entity.User;
import exception.UserNotExistException;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/20 16:13
 * Description:
 * version:1.0
 */
public interface UserService {

    public User login(String username, String password) throws UserNotExistException;
}
