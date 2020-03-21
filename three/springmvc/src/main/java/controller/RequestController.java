package controller;

import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/22 10:26
 * Description:
 * version:1.0
 */
@Controller
@RequestMapping("/request")
public class RequestController {

    @RequestMapping("/f1")
    public String f1(User user){
        System.out.println("f1");
        user.setUsername("admin");
        return "request";
    }
    @RequestMapping("/f2")
    public String f2(@ModelAttribute("u") User user){
        System.out.println("f2");
        user.setUsername("admin");
        return "request";
    }


    @RequestMapping("/f3")
    public void f3(User user){
        System.out.println(user.getUsername());
    }


    @ModelAttribute("list")
    public List<String> loadString(){
        System.out.println("---------------------");
        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        return list;
    }

}
