package dao.impl;

import dao.UserDao;
import entity.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/20 10:26
 * Description:
 * version:1.0
 */
public class UserDaoImpl implements UserDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insertUser(User user) {
        String sql = new StringBuffer()
                .append(" insert into ")
                .append(" t_user ")
                .append("   (username,password,phone,address)")
                .append(" values ")
                .append("   (?,?,?,?)")
                .toString();
        jdbcTemplate.update(sql,user.getUsername(),user.getPassword(),user.getPhone(),user.getAddress());

    }

    public void deleteById(Integer id) {
        String sql=new StringBuffer()
                .append(" delete from t_user ")
                .append(" where id=? ")
                .toString();
        jdbcTemplate.update(sql,id);
    }

    public void updateUser(User user) {

    }

    public User selectById(Integer id) {
        return null;
    }

    public List<User> selectAll() {
        return null;
    }

    public Long insertUserReturnPrimaryKey(final User user) {
        KeyHolder keyHolder=new GeneratedKeyHolder();

        final String sql=new StringBuffer()
                .append(" insert into t_user ")
                .append(" values(?,?,?,?) ")
                .toString();

     /*   jdbcTemplate.update(sql,PreparedStatement.RETURN_GENERATED_KEYS,user.getUsername(),user.getPassword(),user.getPhone(),user.getAddress());
        return PreparedStatement.RETURN_GENERATED_KEYS;*/

     jdbcTemplate.update(new PreparedStatementCreator() {
         public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
             String sql = new StringBuffer()
                     .append(" insert into ")
                     .append(" t_user ")
                     .append("   (username,password,phone,address)")
                     .append(" values ")
                     .append("   (?,?,?,?)")
                     .toString();
             PreparedStatement stmt= connection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
             stmt.setString(1,user.getUsername());
             stmt.setString(2,user.getPassword());
             stmt.setString(3,user.getPhone());
             stmt.setString(4,user.getAddress());
             return stmt;
         }
     },keyHolder);
     return (Long) keyHolder.getKey();
    }
}
