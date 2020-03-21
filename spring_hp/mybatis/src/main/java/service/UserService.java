package service;

import entity.User;
import exception.UserNotExistException;

public interface UserService {
    public void regist(User user);
    public User login(String username, String password) throws UserNotExistException;
}
