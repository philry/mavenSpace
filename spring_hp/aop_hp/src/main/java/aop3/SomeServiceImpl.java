package aop3;

public class SomeServiceImpl implements SomeService {
    public void doSome() {
        System.out.println("doSome");
    }

    public void doOther() {
        System.out.println("doOther");
    }

    public void regist() {
        System.out.println("regist");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
