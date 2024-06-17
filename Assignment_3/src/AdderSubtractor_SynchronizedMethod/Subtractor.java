package AdderSubtractor_SynchronizedMethod;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    private Value v;

    public Subtractor(Value v){
        this.v = v;
    }

    @Override
    public Void call() throws Exception {
        for(int i = 0 ; i <= 1000 ; i++){
            System.out.println("Subtracting...");
            this.v.decrementBy(i);
        }
        return null;
    }
}
