package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/url")
public class UrlController {
    @RequestMapping("/f1")
    public void f1() throws SomeException {
        System.out.println("f1");
        throw new SomeException();
    }
    @RequestMapping("/f2/**")
    public void f2(){
        System.out.println("f2----**");
    }
    @RequestMapping("f6/{userId}")
    public void f6(@PathVariable("userId") int id){
        System.out.println("id:"+id);
    }
    @RequestMapping(value = "f12",params = "name=admin")
    public void f12(){
        System.out.println("f12");
    }
    @RequestMapping(value = "f13",params = "name!=admin")
    public void f13(){
        System.out.println("f13");
    }
}
