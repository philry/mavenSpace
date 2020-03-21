package ioc02;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/14 16:11
 * Description:
 * version:1.0
 */
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
