package ThreadsWithCallable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {
    Node t;
    ExecutorService es;
    TreeSizeCalculator(Node t, ExecutorService es){
        this.t = t;
        this.es = es;
    }

    @Override
    public Integer call() throws Exception {
        if(this.t == null) return 0;
        TreeSizeCalculator lst = new TreeSizeCalculator(t.left, es);
        TreeSizeCalculator rst = new TreeSizeCalculator(t.right, es);
        Future<Integer> left = es.submit(lst);
        Future<Integer> right = es.submit(rst);
        return (left.get() + right.get() + 1);
    }
}
