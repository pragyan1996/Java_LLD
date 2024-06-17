package AdderSubtractor_SynchronizedMethod;

public class Value {
    private int value = 0;

    public synchronized void incrementBy(int num){
        this.value += num;
    }

    public synchronized void decrementBy(int num){
        int currVallue = this.value;
        this.value =currVallue - num;
    }

    public int getValue(){
        return this.value;
    }
}
