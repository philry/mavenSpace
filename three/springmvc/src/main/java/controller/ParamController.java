package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/22 9:05
 * Description:
 * version:1.0
 */
@Controller
@RequestMapping("/param")
public class ParamController {

    @RequestMapping("/f1")
    public void f1(HttpServletRequest request, HttpServletResponse response){
        System.out.println("f1");
    }

    @RequestMapping("/f2")
    public void  f2(HttpSession session){
        System.out.println("f2");
    }

    @RequestMapping("/f3")
    public void f3(InputStream in, OutputStream out){
        System.out.println("f3");
    }

    @RequestMapping("/f4")
    public void f4(Reader reader, Writer writer){
        System.out.println("f4");
    }

    //Application对象不能直接作为参数
    @RequestMapping("/f5")
    public void f5(ServletContext application){
        System.out.println("f5");
    }


    @RequestMapping("/f6")
    public String f6(Model model, Map map, ModelMap modelMap){
        model.addAttribute("model","Hello Model");
        map.put("map","Hello Map");

        //ModelMap既可以作为Model使用，也可以作为Map使用
        modelMap.addAttribute("modelMap1","Hello ModelMap-Model");
        modelMap.put("modelMap2","Hello ModelMap-map");
        //默认存放在request的作用域中
        //但是与request又存在一些区别
        //重定向之后数据并不会丢失，可以通过一定的方法获取
        //详见f8
        return "model";
//        return "redirect:/showModel";
    }


    @RequestMapping("/f7")
    public String f7(){
        return "redirect:/showModel?name=admin";
    }


    @RequestMapping("/f8")
    public String f8(Model model, Map map, ModelMap modelMap){
        model.addAttribute("model","Hello Model");
        map.put("map","Hello Map");

        //ModelMap既可以作为Model使用，也可以作为Map使用
        modelMap.addAttribute("modelMap1","Hello ModelMap-Model");
        modelMap.put("modelMap2","Hello ModelMap-map");
        return "redirect:/showModel";
    }


    //通过RequestParam可以获取请求中指定的key所对应的值
    //当key的值与当前参数的变量名一致的时候，可以省略key
    //且能直接将该注解省略
    //当参数没有被其他注解所标注的时候
    //默认存在RequestParam注解
    //当key与变量名不一致的时候
    //必须通过该注解标明对应的key是谁
    @RequestMapping("/f9")
    public void f9(@RequestParam("username") String name){
        System.out.println("name:"+name);
    }


    @RequestMapping("/f10/{name}")
    public void f10(@PathVariable("name") String name){
        System.out.println("name:"+name);
    }


    @RequestMapping("/f11")
    public void f11(@RequestBody String body){
        System.out.println("-------------");
        System.out.println("body:"+body);
    }





}
