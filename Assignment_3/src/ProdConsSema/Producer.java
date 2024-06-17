package ProdConsSema;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Store store;
    private Semaphore prodSema;
    private Semaphore consSema;

    public Producer(Store store, Semaphore prodSema, Semaphore consSema){
        this.store = store;
        this.prodSema = prodSema;
        this.consSema = consSema;
    }

    @Override
    public void run() {
        while(true){
            try {
                prodSema.acquire();
                Thread.sleep(10);
            } catch (Exception e){
                throw new RuntimeException(e);
            }
            store.addItem();
            consSema.release();
        }
    }
}
