package numberPrinterThreadPool;

import numberPrinter.NumberPrinter;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService e = Executors.newCachedThreadPool();
        for(int i = 1 ; i <= 10000 ; i++){
            NumberPrinter numberPrinter = new NumberPrinter(i);
            e.execute(numberPrinter);
        }
    }
}
