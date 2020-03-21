package controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello implements Controller {
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mav=new ModelAndView();
        String name=request.getParameter("name");
        mav.addObject("msg","hello:"+name);
        mav.setViewName("hello");//跳转WEB-INF/pages/hello.jsp页面
        return mav;
    }
}
