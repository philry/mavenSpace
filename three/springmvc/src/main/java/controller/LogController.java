package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/22 14:06
 * Description:
 * version:1.0
 */
@Controller
@RequestMapping("/log")
public class LogController {

    @RequestMapping("/add")
    public void add(){
        System.out.println("add");
    }


    @RequestMapping("/remove")
    public void remove(){
        System.out.println("remove");
    }


    @RequestMapping("/modify")
    public void modify(){
        System.out.println("modify");
    }

    @RequestMapping("/find")
    public void find(){
        System.out.println("find");
    }


}
