package HelloWorld_Printer;

public class Helloworldprinter implements Runnable{
    private void doSomething(){
        System.out.println("hello form the do something: " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("Hello from the run method "+ Thread.currentThread().getName());
        doSomething();
    }
}
