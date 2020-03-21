package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
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

@Controller
@RequestMapping("/param")
public class ParamController {
    @RequestMapping("/f1")
    public void f1(HttpServletRequest request,HttpServletResponse response){
        System.out.println("f1");
    }
    @RequestMapping("/f2")
    public void f2(InputStream in, OutputStream out){
        System.out.println("f2");
    }
    @RequestMapping("/f3")
    public void f3(Reader reader, Writer writer){
        System.out.println("f3");
    }
    @RequestMapping("/f4")
    public void f4(HttpSession session){
        System.out.println("f4");
    }
    @RequestMapping("/f5")
    public void f5(ServletContext application){
        System.out.println("f5");
    }
    @RequestMapping("/f6")
    public String f6(Model model, Map map, ModelMap modelMap){
        model.addAttribute("model","model...");
        map.put("map","map...");
        modelMap.addAttribute("modelMap1","modelMap...asModel");
        modelMap.put("modelMap2","modelMap...asMap");
      //  return "model";
        return "redirect:showModel";
    }
    @RequestMapping("/f7")
    public String f7(){return "redirect:/showModel?name=admin";}
    @RequestMapping("/f9")
    public void f9(@RequestParam("username") String name){
        System.out.println("name:"+name);
    }


}
