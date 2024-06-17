package ProdConsSema;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Store store;
    private Semaphore prodSema, consSema;

    public Consumer(Store store, Semaphore prodSema, Semaphore consSema){
        this.store = store;
        this.prodSema = prodSema;
        this.consSema = consSema;
    }

    @Override
    public void run() {
        while(true){
            try {
                consSema.acquire();
                Thread.sleep(10);
            } catch (Exception e){
                throw new RuntimeException(e);
            }
            store.removeItem();
            prodSema.release();
        }
    }
}
