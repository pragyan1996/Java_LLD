package AdderSubtractor_SynchronizedObject;

import java.util.concurrent.Callable;

public class Subtract implements Callable<Void> {
    private Value v;
    public Subtract(Value v){
        this.v = v;
    }

    @Override
    public Void call() throws Exception {
        for(int i = 1 ; i <= 5000 ; i++){
            synchronized (v){
                this.v.v -= i;
            }
        }
        return null;
    }
}
