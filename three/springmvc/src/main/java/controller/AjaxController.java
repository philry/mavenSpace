package controller;

import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/22 16:04
 * Description:
 * version:1.0
 */
@Controller
@RequestMapping("/ajax")
public class AjaxController {

    @RequestMapping("/show")
    public String show(){
        return "ajax";
    }


    //@ResponseBody表示当前方法返回的不再是视图
    //而是数据模型
    //produces:配置响应体
    @ResponseBody
    @RequestMapping(value = "/checkUsername",produces = "text/html;charset=utf-8")
    public String checkUsername(String username){
        if("admin".equals(username)){
            return "该用户已经存在";
        }
        return "用户名可用";
    }



    @ResponseBody
    @RequestMapping("/find")
    public User find(){
        User user = new User();
        user.setId(1);
        user.setUsername("admin");
        user.setPassword("admin");
        user.setPhone("13812345678");
        user.setAddress("江苏-南京");
        user.setBirthday(new Date());
        return user;
    }



}
