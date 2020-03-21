package servlet;

import entity.User;
import exception.UserNotExistException;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import userService.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApplicationContext ac=WebApplicationContextUtils.getWebApplicationContext(getServletContext());
        UserService userService= (UserService) ac.getBean("userserviceImpl");
        String username=req.getParameter("username");
        String password=req.getParameter("password");

        try {
            User user = userService.login(username, password);
            req.setAttribute("user",user);
            resp.sendRedirect(req.getContextPath()+"/success.jsp");
        } catch (UserNotExistException e) {
            e.printStackTrace();
            req.setAttribute("loginMsg",e.getMessage());
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        }
    }
}
