package controller;

import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/21 13:31
 * Description:
 * version:1.0
 */
@Controller
public class LoginController {

//    @RequestMapping("/showLogin")
//    public ModelAndView showLogin(){
//        ModelAndView mav = new ModelAndView();
//        mav.setViewName("login");
//        return mav;
//    }

    @RequestMapping("/aa")
    public String aa(){
        return "login";
    }

    @RequestMapping("/f2")
    public String f2(){
        return "redirect:/showLogin";
    }

    @RequestMapping("/f3")
    public String f3(){
        return "forward:/showLogin";
    }

    @RequestMapping("/f4")
    public void f4(){
        System.out.println("f4");
    }

    @RequestMapping("/f5")
    public void f5(HttpServletResponse response) throws IOException {
        System.out.println("f5");
        response.sendRedirect("showLogin");
    }


//    @RequestMapping("/login")
//    public void login(HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException {
//        request.setCharacterEncoding("utf-8");
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        System.out.println("username:"+username+",password:"+password);
//
//    }

//    @RequestMapping("/login")
//    public void login(String username,String password,HttpServletRequest request) throws UnsupportedEncodingException {
//        request.setCharacterEncoding("utf-8");
//        System.out.println("username:"+username+",password:"+password);
//    }


//    @RequestMapping("/login")
//    public void login(User user){
//        System.out.println("username:"+user.getUsername()+",password:"+user.getPassword());
//    }


//    @RequestMapping("/login")
//    public ModelAndView login(String username,String password){
//        ModelAndView mav = new ModelAndView();
//        System.out.println("username:"+username+",password:"+password);
//        if("admin".equals(username) && "123".equals(password)){
//            mav.setViewName("hello");
//            mav.addObject("msg","恭喜您，登录成功");
//            return mav;
//        }
//        mav.setViewName("login");
//        mav.addObject("loginMsg","用户名或密码错误");
//        return mav;
//    }


    @RequestMapping("/login")
    public ModelAndView login(String username, String password, HttpSession session){
        ModelAndView mav = new ModelAndView();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String url = "jdbc:mysql://127.0.0.1:3306/mybatis?useUnicode=true&characterEncoding=utf-8";
        User user = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,"root","");
            String sql = new StringBuffer()
                    .append(" select id,username,password,phone,address ")
                    .append(" from t_user ")
                    .append(" where username = ? ")
                    .append(" and password = ? ")
                    .toString();
            ps = conn.prepareStatement(sql);
            ps.setString(1,username);
            ps.setString(2,password);
            rs = ps.executeQuery();
            if(rs.next()){
                user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setPhone(rs.getString("phone"));
                user.setAddress(rs.getString("address"));
                mav.addObject("msg","恭喜您，登录成功");
                mav.setViewName("hello");
                session.setAttribute("user",user);
                return mav;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        mav.addObject("loginMsg","用户名或密码错误");
        mav.setViewName("login");
        return mav;

    }


}
