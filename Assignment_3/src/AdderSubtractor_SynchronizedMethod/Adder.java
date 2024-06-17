package AdderSubtractor_SynchronizedMethod;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private Value v;
    public Adder(Value v){
        this.v = v;
    }

    @Override
    public Void call() throws Exception {
        for(int i = 0 ; i <= 1000 ; i++){
            System.out.println("Adding...");
            this.v.incrementBy(i);
        }
        return null;
    }
}
