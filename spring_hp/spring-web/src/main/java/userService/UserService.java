package userService;

import entity.User;
import exception.UserExistException;
import exception.UserNotExistException;

public interface UserService {
    public void regist(User user)throws UserExistException;

    public User login(String username,String password)throws UserNotExistException;
}
