package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SomeBean {

    @Autowired
        @Qualifier("ob")
    private OtherBean ob;

    public OtherBean getOb() {
        return ob;
    }

    public void setOb(OtherBean ob) {
        this.ob = ob;
    }

    public void doSome(){
        System.out.println("someBean----doSome");
    }

    public void doOther(){
        System.out.println("someBean---doOther");
    }
}
