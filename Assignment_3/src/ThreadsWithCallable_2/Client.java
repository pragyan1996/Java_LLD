package ThreadsWithCallable_2;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        ExecutorService es = Executors.newCachedThreadPool();
        ArrayCreator ac = new ArrayCreator(n);
        Future<List<Integer>> obj = es.submit(ac);
        System.out.println(obj.get());

    }
}
