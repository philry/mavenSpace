package servlet;

import entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;


import static java.lang.Class.forName;

@WebServlet("/regist")
public class RegistServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("utf-8");

        String username=req.getParameter("username");
        if(null==username||"".equals(username.trim())){
            req.setAttribute("registMsg","用户名不可为空");
            req.getRequestDispatcher("/regist.jsp").forward(req,resp);
            return;
        }
        String password=req.getParameter("password");
        if(null==password||"".equals(password.trim())){
            req.setAttribute("registMsg","密码不可为空");
            req.getRequestDispatcher("/regist.jsp").forward(req,resp);
            return;
        }
        System.out.println("000");
        String rePassword=req.getParameter("rePassword");
        if(null==rePassword||"".equals(rePassword.trim())){
            req.setAttribute("registMsg","确认密码不可为空");
            req.getRequestDispatcher("/regist.jsp").forward(req,resp);
            return;
        }
        System.out.println(111);
        if(!password.equals(rePassword)){
            req.setAttribute("registMsg","两次密码不一致");
            req.getRequestDispatcher("/regist.jsp").forward(req,resp);
            return;

        }
        System.out.println(33);
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        String url="jdbc:mysql://127.0.0.1:3306/mybatis?useUnicode=true&characterEncoding=utf8";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(url,"root","");

            String sql0=new StringBuffer()
                    .append(" select username,password from t_user ")
                    .append(" where username=? and password=? ").toString();
            ps=conn.prepareStatement(sql0);
            ps.setString(1,username);
            ps.setString(2,password);
            rs=ps.executeQuery();
            if(rs.next()){
                req.setAttribute("registMsg","该用户已存在");
                req.getRequestDispatcher("/regist.jsp").forward(req,resp);
                return;
            }

            String sql=new StringBuffer()
                    .append(" insert into t_user(username,password) ")
                    .append(" values(?,?) ").toString();
            ps=conn.prepareStatement(sql);
            ps.setString(1,username);
            ps.setString(2,password);
            ps.executeUpdate();

            User user=new User();
            user.setUsername(username);
            user.setPassword(password);
            req.getSession().setAttribute("user",user);
            resp.sendRedirect(req.getContextPath()+"/success.jsp");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            req.setAttribute("registMsg","未找到资源");
            req.getRequestDispatcher("/regist.jsp").forward(req,resp);
        } catch (SQLException e) {
            e.printStackTrace();
            req.setAttribute("registMsg","sql语句错误");
            req.getRequestDispatcher("/regist.jsp").forward(req,resp);
        }

    }
}
