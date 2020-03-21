package controller;

import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.sql.*;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public ModelAndView login(User user, HttpSession session){
        ModelAndView mav=new ModelAndView();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://127.0.0.1:3306/mybatis?useUnicode=true&characterEncoding=utf-8";
            Connection conn=DriverManager.getConnection(url,"root","");
            String sql=new StringBuffer()
                    .append(" select username,password from t_user ")
                    .append(" where username=? and password=? ").toString();
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1,user.getUsername());
            ps.setString(2,user.getPassword());
            ResultSet rs=ps.executeQuery();

            if(rs.next()){
                User user2=new User();
                user2.setUsername(rs.getString("username"));
                user2.setPassword(rs.getString("password"));
                mav.addObject("msg","恭喜登录成功");
                session.setAttribute("user",user);
                mav.setViewName("hello");
                return mav;   //跳转hello.jsp页面
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        mav.addObject("loginMsg","登录失败");
        mav.setViewName("login");
        return mav;
    }
}
