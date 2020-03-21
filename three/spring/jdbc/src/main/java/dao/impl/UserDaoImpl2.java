package dao.impl;

import dao.UserDao;
import entity.User;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/20 11:50
 * Description:
 * version:1.0
 */
public class UserDaoImpl2 extends JdbcDaoSupport implements UserDao {
    public void insertUser(User user) {
        String sql = new StringBuffer()
                .append(" insert into ")
                .append(" t_user ")
                .append("   (username,password,phone,address)")
                .append(" values ")
                .append("   (?,?,?,?)")
                .toString();
        getJdbcTemplate().update(sql,user.getUsername(),user.getPassword(),user.getPhone(),user.getAddress());

    }

    public void deleteById(Integer id) {

    }

    public void updateUser(User user) {

    }

    public User selectById(Integer id) {
        return null;
    }

    public List<User> selectAll() {
        return null;
    }

    public Long insertUserReturnPrimaryKey(User user) {
        return null;
    }
}
