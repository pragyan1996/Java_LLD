package numberPrinter;

public class NumberPrinter implements Runnable{
    private int numberToPrint;

    public NumberPrinter(int numberToPrint){
        this.numberToPrint = numberToPrint;
    }

    @Override
    public void run() {
        System.out.println("Inside the run method of runnable : " + numberToPrint + " Printed by "+ Thread.currentThread().getName());
    }
}
