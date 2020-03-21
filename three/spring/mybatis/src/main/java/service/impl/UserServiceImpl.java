package service.impl;

import dao.UserMapper;
import entity.User;
import entity.UserExample;
import exception.UserNotExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import service.UserService;

import java.util.List;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/20 15:03
 * Description:
 * version:1.0
 */
//在类上配置事务，表示当前事务对当前类中的所有方法生效
@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public void regist(User user) {
        userMapper.insertSelective(user);
    }

    //在方法上配置事务，表示只对当前方法生效
    //方法上的事务配置优先级高于类上的
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public User login(String username, String password) throws UserNotExistsException {
        UserExample example = new UserExample();
        example.or()
                .andUsernameEqualTo(username)
                .andPasswordEqualTo(password);
        List<User> users = userMapper.selectByExample(example);
        if(users.isEmpty()){
            throw new UserNotExistsException("用户名或密码错误");
        }
        return users.get(0);
    }


}
