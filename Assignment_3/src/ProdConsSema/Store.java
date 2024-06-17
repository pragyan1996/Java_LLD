package ProdConsSema;

import java.util.Objects;
import java.util.Vector;

public class Store {
    private int maxSize;
    private Vector<Object> items;

    public Store(int maxSize){
        this.maxSize = maxSize;
        items = new Vector<>();
    }

    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }

    public int getMaxSize(){
        return this.getMaxSize();
    }

    public void addItem(){
        this.items.add(new Object());
        System.out.println("Item produced : "+this.items.size());
    }

    public void removeItem(){
        this.items.remove(this.items.size() - 1);
        System.out.println("Item has been consumed : "+this.items.size());
    }
}
