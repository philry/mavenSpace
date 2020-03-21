package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/21 11:22
 * Description:
 * version:1.0
 */
@Controller
public class HelloAnnotationController {

    @RequestMapping("/hello")
    public String hello(HttpServletRequest request){
        request.setAttribute("msg","Hello World!");
        return "hello";
    }

}
