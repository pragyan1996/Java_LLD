package numberPrinter;

public class Main {
    public static void main(String[] args) {
        for(int i = 0 ; i <= 50000 ; i++){
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread t = new Thread(numberPrinter);
            t.start();
        }
    }
}
