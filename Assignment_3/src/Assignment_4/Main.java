package Assignment_4;

interface I1{
    void f();
    void f2();
}

interface I2{
    void f1();
    void f();
}

interface I3 extends I1, I2{

}

class C implements I3{

    @Override
    public void f() {
        System.out.println("In f1");
    }

    @Override
    public void f1() {
        System.out.println("In f2");
    }

    @Override
    public void f2() {
        System.out.println("In f3");
    }
}

public class Main {
    public static void main(String[] args) {
        C c = new C();
        c.f();
        c.f1();
        c.f2();
    }
}
