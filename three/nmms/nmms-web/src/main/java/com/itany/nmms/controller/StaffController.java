package com.itany.nmms.controller;

import com.itany.nmms.entity.Staff;
import com.itany.nmms.exception.CodeErrorException;
import com.itany.nmms.exception.StaffNotExistException;
import com.itany.nmms.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/23 11:08
 * Description:
 * version:1.0
 */
@Controller
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private StaffService staffService;


    @RequestMapping("/login")
    public ModelAndView login(String loginName, String password, String role, String code, HttpSession session){
        ModelAndView mav = new ModelAndView();
        String image = (String) session.getAttribute("code");


        try {
            Staff staff = staffService.login(loginName,password,role,code,image);
            session.setAttribute("staff",staff);
            mav.setViewName("backend/main");
        } catch (CodeErrorException e) {
            mav.addObject("loginMsg",e.getMessage());
            mav.setViewName("backend/login");
        } catch (StaffNotExistException e) {
            mav.addObject("loginMsg",e.getMessage());
            mav.setViewName("backend/login");
        } catch (Exception e){
            e.printStackTrace();
            mav.addObject("loginMsg","服务器内部异常");
            mav.setViewName("backend/login");
        }
        return mav;

    }

}
