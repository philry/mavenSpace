package ioc4;

public class SomeBean {
    private String name;

    public SomeBean() {
    }

    public SomeBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void a(){
        System.out.println("正在初始化"+name);
    }

    public void b(){
        System.out.println("正在销毁");
    }
}
