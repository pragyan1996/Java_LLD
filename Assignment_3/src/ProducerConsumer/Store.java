package ProducerConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Store {
    private int maxSize;
    private List<Objects> items;

    public Store(int maxSize){
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public int getMaxSize(){ return this.maxSize; }

    public void setMaxSize(int maxSize){this.maxSize = maxSize;}

    public List<Objects> getItems(){return this.items;}

    public void setItems(List<Objects> items){this.items = items;}

    public void addItems(){
        items.add(null);
        System.out.println("Item has been produced..." +this.items.size());
    }

    public void removeItem(){
        items.remove(this.items.size()-1);
        System.out.println("Item consumed : "+this.items.size());
    }
}
