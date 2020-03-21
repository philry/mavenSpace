package userService.impl;

import dao.UserMapper;
import entity.User;
import entity.UserExample;
import exception.UserExistException;
import exception.UserNotExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import userService.UserService;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public void regist(User user) throws UserExistException {
        UserExample userExample=new UserExample();
        userExample.or()
                .andIdEqualTo(user.getId());
        userMapper.selectByExample(userExample);



    }

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public User login(String username, String password) throws UserNotExistException {
        User user=new User();
        user.setUsername(username);
        user.setPassword(password);
        if(!"admin".equals(username)&&!"admin".equals(password)){
            throw new UserNotExistException("用户名或密码不正确");
        }
        UserExample userExample=new UserExample();
        userExample.or()
                .andUsernameEqualTo(username)
                .andPasswordEqualTo(password);
        List<User> users = userMapper.selectByExample(userExample);
        return users.get(0);
    }
}
