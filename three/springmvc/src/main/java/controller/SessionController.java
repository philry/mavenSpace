package controller;

import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/22 10:36
 * Description:
 * version:1.0
 */
@Controller
@RequestMapping("/session")
@SessionAttributes("user")
public class SessionController {

    @RequestMapping("/f1")
    public String f1(HttpSession session){
        User user = new User();
        user.setUsername("admin");
        session.setAttribute("user",user);
        return "session";
    }

    @RequestMapping("/f2")
    public void f2(HttpSession session){
        User user = (User) session.getAttribute("user");
        System.out.println(user.getUsername());
    }


    @RequestMapping("/f3")
    public void f3(@ModelAttribute("user") User user){
        System.out.println(user);
        //此时参数的对象默认是存放于request中
        //希望参数的对象默认是存放在session中
    }


    @RequestMapping("/f4")
    public void  f4(HttpSession session){
        session.invalidate();
        //当使用SessionAttributes之后
        //发现清空后数据仍然存在
        //怎么办?
    }


    @RequestMapping("/f5")
    public void f5(SessionStatus status){
        status.setComplete();
    }


}
