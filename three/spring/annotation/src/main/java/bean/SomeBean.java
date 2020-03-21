package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/19 14:18
 * Description:
 * version:1.0
 */
@Component
//@Component("aa")
public class SomeBean {

    @Autowired
//    @Qualifier("ob")
    private OtherBean otherBean;

    public OtherBean getOtherBean() {
        return otherBean;
    }

    public void setOtherBean(OtherBean otherBean) {
        this.otherBean = otherBean;
    }
//    public OtherBean getOb() {
//        return ob;
//    }
//
//    public void setOb(OtherBean ob) {
//        this.ob = ob;
//    }

    public void doSome(){
        System.out.println("SomeBean---doSome");
    }

    public void doOther(){
        System.out.println("SomeBean---doOther");
    }

}
