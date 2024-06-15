package ThreadsWithCallable;

import java.util.concurrent.Callable;

public class TreeSizeCalculator implements Callable<Integer> {
    Node t;
    TreeSizeCalculator(Node t){
        this.t = t;
    }

    @Override
    public Integer call() throws Exception {
        if(this.t == null) return 0;
        return 0;
    }
}
