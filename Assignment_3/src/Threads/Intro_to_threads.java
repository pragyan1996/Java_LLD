package Threads;

public class Intro_to_threads {
    public static void main(String[] args) {
        Adder_1 a = new Adder_1();
        Subtractor_1 s = new Subtractor_1();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(s);
        t1.start();
        t2.start();
        System.out.println("I am the main class...");
    }
}
