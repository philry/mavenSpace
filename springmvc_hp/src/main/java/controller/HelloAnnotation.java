package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloAnnotation {
    @RequestMapping("/hello")
    public String hello(HttpServletRequest request){
        request.setAttribute("msg","hello");
        return "hello";//返回WEB-INF/pages下的hello.jsp
    }
}
