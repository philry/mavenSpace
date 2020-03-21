package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/21 15:55
 * Description:
 * version:1.0
 */
@Controller
@RequestMapping("/url")
public class UrlController {

    @RequestMapping("/f1")
    public void f1() throws SomeException {
        System.out.println("f1");
        throw new SomeException();
    }

    @RequestMapping("/f2/*")
    public void f2() throws IOException {
        System.out.println("f2---*");
        throw new IOException();
    }

    @RequestMapping("/f3/**")
    public void f3(){
        System.out.println("f3---**");
    }


    @RequestMapping("/f4/?")
    public void f4(){
        System.out.println("f4---?");
    }

    @RequestMapping("/f5/find?")
    public void f5(){
        System.out.println("f5");
    }


    @RequestMapping("/f6/{id}")
    public void f6(@PathVariable String id){
        System.out.println("id:"+id);
    }

    @RequestMapping("/f7/{id}")
    public void f7(@PathVariable("id") String username){
        System.out.println("username:"+username);
    }
    @RequestMapping("/f8/{id:\\d+}")
    public void f8(@PathVariable int id){
        System.out.println("id:"+id);
    }

    @RequestMapping(value={"/f9","/test9"})
    public void f9(){
        System.out.println("f9");
    }

    @RequestMapping(value = "/f10",method = RequestMethod.POST)
    public void f10(){
        System.out.println("f10");
    }

    //表示请求中必须包含指定的参数
    @RequestMapping(value = "/f11",params = "name")
    public void f11(){
        System.out.println("f11");
    }

    //表示请求中必须包含指定的参数
    @RequestMapping(value = "/f12",params = "name=admin")
    public void f12(){
        System.out.println("f12");
    }

    //表示请求中必须包含指定的参数
    @RequestMapping(value = "/f13",params = "name!=admin")
    public void f13(){
        System.out.println("f13");
    }

}
