package AdderSubtractor_SynchronizedObject;

import AdderSubtractor_SynchronizedMethod.Subtractor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v = new Value();
        Adder adder = new Adder(v);
        Subtract subtract = new Subtract(v);

        ExecutorService es = Executors.newCachedThreadPool();
        Future<Void> adderFuture = es.submit(adder);
        Future<Void> subtractorFuture = es.submit(subtract);

        adderFuture.get();
        subtractorFuture.get();
        System.out.println(v.v);
    }
}
