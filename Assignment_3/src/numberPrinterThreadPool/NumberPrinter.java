package numberPrinterThreadPool;

public class NumberPrinter implements Runnable{
    private int numbertoprint;
    public NumberPrinter(int numbertoprint){
        this.numbertoprint = numbertoprint;
    }

    @Override
    public void run() {
        System.out.println(numbertoprint + " printed by " + Thread.currentThread().getName());
    }
}
