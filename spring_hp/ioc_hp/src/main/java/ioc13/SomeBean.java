package ioc13;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SomeBean implements ApplicationContextAware {
    private ApplicationContext ac;
    public void doSome(){
        System.out.println("doSome ac:"+ac);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ac=ac;
    }
}
