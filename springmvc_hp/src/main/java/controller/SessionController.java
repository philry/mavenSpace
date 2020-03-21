package controller;

import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/session")
@SessionAttributes("user")
public class SessionController {
    @RequestMapping("/f1")
    public String f1(HttpSession session){
        System.out.println("f1");
        User user=new User();
        user.setUsername("admin");
        session.setAttribute("user",user);
        return "session";
    }
    @RequestMapping("/f2")
    public void f2(HttpSession session){
        User user = (User) session.getAttribute("user");
        System.out.println(user);
    }
    @RequestMapping("/f3")
    public void f3(@ModelAttribute("user") User user){
        System.out.println(user);
    }
    @RequestMapping("/f4")
    public void  f4(HttpSession session) {
        session.invalidate();//清空
    }
}
