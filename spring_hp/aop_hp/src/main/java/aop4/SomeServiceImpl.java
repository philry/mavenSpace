package aop4;

public class SomeServiceImpl implements SomeService{
    public void doSome() {
        System.out.println("SomeService---doSome");
    }

    public void doOther() {
        System.out.println("SomeService---doOther");
    }
}
