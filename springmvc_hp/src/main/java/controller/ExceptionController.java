package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
@RequestMapping("/exception")
public class ExceptionController {
    @ExceptionHandler
    public ModelAndView exceptionHandler(Exception e){
        ModelAndView mav=new ModelAndView();
        if(e instanceof SomeException){
            mav.setViewName("exception");
            mav.addObject("e",e);
        }
        if(e instanceof IOException){
            mav.setViewName("exception");
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
