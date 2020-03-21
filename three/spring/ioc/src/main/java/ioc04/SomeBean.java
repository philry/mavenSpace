package ioc04;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/15 9:05
 * Description:
 * version:1.0
 */
public class SomeBean {
    private String name;

    {
//        System.out.println("代码块中name:"+name);
    }

    public SomeBean() {
//        System.out.println("name:"+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("正在销毁");
        super.finalize();
    }

    public void a(){
        System.out.println("正在初始化"+name);
    }

    public void b(){
        System.out.println("正在销毁");
    }
}
