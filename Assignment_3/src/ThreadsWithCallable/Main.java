package ThreadsWithCallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws  ExecutionException, InterruptedException  {
        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(6);
        root.left.left = new Node(3);
        root.left.right = new Node(2);
        ExecutorService es = Executors.newCachedThreadPool();
        TreeSizeCalculator obj = new TreeSizeCalculator(root, es);
        Future<Integer> ans= es.submit(obj);
        System.out.println(ans.get());
    }
}
