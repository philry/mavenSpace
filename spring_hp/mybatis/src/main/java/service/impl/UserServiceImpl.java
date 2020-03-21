package service.impl;

import dao.UserMapper;
import entity.User;
import entity.UserExample;
import exception.UserNotExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import service.UserService;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    public void regist(User user) {
        userMapper.insertSelective(user);
    }

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public User login(String username, String password) throws UserNotExistException {
        UserExample userExample=new UserExample();
        userExample.or()
                .andUsernameEqualTo(username)
                .andPasswordEqualTo(password);
        List<User> users=userMapper.selectByExample(userExample);
        if(users.isEmpty()){
            throw new UserNotExistException("用户名或密码不正确");
        }
        return users.get(0);
    }
}
