package ioc2;

public class SomeBean {
    private int age;
    private OtherBean otherBean;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public OtherBean getOtherBean() {
        return otherBean;
    }

    public void setOtherBean(OtherBean otherBean) {
        this.otherBean = otherBean;
    }
}
