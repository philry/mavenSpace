package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/22 10:48
 * Description:
 * version:1.0
 */
@Controller
@RequestMapping("/app")
public class ApplicationController {

    @RequestMapping("/f1")
    public void f1(ServletContext application){
        System.out.println("f1");
    }

    //Application不能作为Handler方法的参数
    //那该如何获取Application对象
    @RequestMapping("/f2")
    public void f2(HttpSession session){
        ServletContext application = session.getServletContext();
        System.out.println("application:"+application);
    }

    @RequestMapping("/f3")
    public String f3(HttpSession session){
        ServletContext application = session.getServletContext();
        application.setAttribute("msg","Hello Application");
        return "application";
    }


}
