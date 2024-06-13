package HelloWorld_Printer;

public class Main {
    //Printing hello world in multithreading...
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        Helloworldprinter helloworldprinter = new Helloworldprinter();
        Thread t1 = new Thread(helloworldprinter);
        t1.start();
        System.out.println(Thread.currentThread().getName() + " Hello world...");
    }


}
