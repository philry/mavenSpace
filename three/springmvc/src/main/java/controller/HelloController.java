package controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/21 9:46
 * Description:
 * version:1.0
 */
public class HelloController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {


        ModelAndView mav = new ModelAndView();

        String name = request.getParameter("name");

        mav.addObject("msg","Hello "+name);

        mav.setViewName("hello");


        return mav;
    }
}
