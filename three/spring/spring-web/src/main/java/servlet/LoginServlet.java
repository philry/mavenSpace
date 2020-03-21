package servlet;

import entity.User;
import exception.UserNotExistException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/20 16:13
 * Description:
 * version:1.0
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        UserService userService = (UserService) ac.getBean("userService");

        ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
        UserService userService = (UserService) ac.getBean("userService");


        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            User user = userService.login(username,password);
            request.getSession().setAttribute("user",user);
            response.sendRedirect(request.getContextPath()+"/success.jsp");
        } catch (UserNotExistException e) {
            request.setAttribute("loginMsg",e.getMessage());
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }


    }
}
