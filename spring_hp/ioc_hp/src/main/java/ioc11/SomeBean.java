package ioc11;

public class SomeBean {
    private OtherBean otherBean;

    public OtherBean getOtherBean() {
        return otherBean;
    }

    public void setOtherBean(OtherBean otherBean) {
        this.otherBean = otherBean;
    }

   /* private OtherBean otherBean2;

    public OtherBean getOtherBean2() {
        return otherBean2;
    }

    public void setOtherBean2(OtherBean otherBean2) {
        this.otherBean2 = otherBean2;
    }*/
}
