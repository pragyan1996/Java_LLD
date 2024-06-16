package ThreadsWithCallable_2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class ArrayCreator implements Callable<List<Integer>> {
    private int n;
    ArrayCreator(int n){
        this.n = n;
    }

    @Override
    public List<Integer> call() throws Exception {
        List<Integer> res = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++){
            res.add(i);
            System.out.println(Thread.currentThread().getName() + " prints the number " + i);
        }
        return res;
    }
}
