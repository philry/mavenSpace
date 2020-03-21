package dao;

import entity.User;

import java.util.List;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/20 10:24
 * Description:
 * version:1.0
 */
public interface UserDao {

    public void insertUser(User user);

    public void deleteById(Integer id);

    public void updateUser(User user);

    public User selectById(Integer id);

    public List<User> selectAll();

    public Long insertUserReturnPrimaryKey(final User user);

}
