package AdderSubtractor;


public class Added implements Runnable{
    private Value v;

    public Added(Value v){
        this.v = v;
    }

    @Override
    public void run() {
        for(int i = 1 ; i <= 5000 ; i++){
            this.v.v += i;
        }
    }
}
