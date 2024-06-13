package AdderSubtractor;

public class Subtractor implements Runnable{
    private Value v;

    public Subtractor(Value v){
         this.v = v;
    }

    @Override
    public void run() {
        for(int i = 1 ; i <= 5000 ; i++){
            this.v.v -= i;
        }
    }
}
