package AdderSubtractor_SynchronizedMethod;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v = new Value();
        Adder adder = new Adder(v);
        Subtractor subtractor = new Subtractor(v);

        ExecutorService es = Executors.newCachedThreadPool();
        Future<Void> adderF = es.submit(adder);
        Future<Void> subF = es.submit(subtractor);

        adderF.get();
        subF.get();

        System.out.println(v.getValue());
    }
}
