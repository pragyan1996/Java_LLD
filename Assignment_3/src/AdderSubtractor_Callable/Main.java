package AdderSubtractor_Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v = new Value();
        Adder add = new Adder(v);
        Subtractor sub = new Subtractor(v);

        ExecutorService es = Executors.newCachedThreadPool();
        Future<Void> addFuture = es.submit(add);
        Future<Void> subFuture = es.submit(sub);

        addFuture.get();
        subFuture.get();

        System.out.println(v.value);
    }
}
