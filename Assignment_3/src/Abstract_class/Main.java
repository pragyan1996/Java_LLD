package Abstract_class;

abstract class Car{
    int mileage;
    Car(int mileage){
        this.mileage = mileage;
    }

    public abstract void pressBreak();
    public abstract void pressClutch();

    public int getNumberOfWheels(){
        return 4;
    }
}

public class Main {
}
