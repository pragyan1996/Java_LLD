package AdderSubtractor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        Value v = new Value();
        Added adder = new Added(v);
        Subtractor subtractor = new Subtractor(v);

        ExecutorService es = Executors.newCachedThreadPool();
        Thread t1 = new Thread(subtractor);
        Thread t2 = new Thread(adder);
        t1.start();
        t2.start();
        System.out.println(v.v);
    }
}
