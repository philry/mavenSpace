package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/22 11:36
 * Description:
 * version:1.0
 */
@Controller
@RequestMapping("/exception")
public class ExceptionController {



    //@ExceptionHandler该注解表示当前方法用于处理当前Controller中的异常
    //该注解可以传递参数
    //表示当前方法处理的异常类型
//    @ExceptionHandler(SomeException.class)
//    public ModelAndView exceptionHandler(Exception e){
//        return new ModelAndView("exception","e",e);
//    }
//
//
//    @ExceptionHandler(IOException.class)
//    public ModelAndView exceptionHandler2(Exception e){
//        return new ModelAndView("exception","e",e);
//    }


    @ExceptionHandler
    public ModelAndView exceptionHandler(Exception e){
        ModelAndView mav = new ModelAndView();

        if(e instanceof SomeException){
            mav.setViewName("exception");
            mav.addObject("e",e);
        }
        if(e instanceof IOException){
            mav.setViewName("exception2");
            mav.addObject("e",e);
        }

        return mav;
    }


    @RequestMapping("/f1")
    public void f1() throws SomeException {
        throw new SomeException("SomeException");
    }


    @RequestMapping("/f2")
    public void f2() throws IOException {
        throw new IOException("IOException");
    }

}
