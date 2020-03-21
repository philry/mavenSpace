package controller;

import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ajax")
public class AjaxController {
    @RequestMapping("/show")
    public String ajax(){
        return "ajax"; //跳转至ajax.jsp页面
    }

    @ResponseBody
    @RequestMapping("/find")
    public User show(){
        User user=new User();
        user.setId(1);
        user.setUsername("admin");
        user.setPassword("admin");
        user.setPhone("1234567890");
        user.setAddress("南京");
        return user;
    }
}
