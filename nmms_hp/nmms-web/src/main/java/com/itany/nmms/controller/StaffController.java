package com.itany.nmms.controller;

import com.itany.nmms.ecxeption.CodeErrorException;
import com.itany.nmms.ecxeption.StaffNotExistException;
import com.itany.nmms.entity.Staff;
import com.itany.nmms.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/staff")
public class StaffController { //这里参数名要和jsp页面form表单里的name属性值一样,值就会传过来(框架实现)
    @Autowired
    private StaffService staffService;

    @RequestMapping("/login")
    public ModelAndView login(String username, String password, String role, String code, HttpSession session){
        String image= (String) session.getAttribute("code");//codecontroller中将验证码通过setSttribute放到了session中
        ModelAndView mav=new ModelAndView();
        try {
            Staff staff = staffService.login(username, password, role, code, image);
            session.setAttribute("staff",staff);
            mav.setViewName("backend/main");
        } catch (CodeErrorException e) {
            e.printStackTrace();
            mav.addObject("logMsg",e.getMessage());
            mav.setViewName("backend/login");
        } catch (StaffNotExistException e) {
            e.printStackTrace();
            mav.addObject("logMsg",e.getMessage());
            mav.setViewName("backend/login");
        }
        return mav;
    }
}
