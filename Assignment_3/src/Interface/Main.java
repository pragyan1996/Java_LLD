package Interface;

interface Bird{
    public void fly();
}

interface NonFlyingBirds{
    public void canRun();
}

class Eagle implements Bird{
    @Override
    public void fly() {
        System.out.println("This bird is a flying bird");
    }
}

class Chicken implements NonFlyingBirds{
    @Override
    public void canRun() {
        System.out.println("This is a non flying bird.");
    }
}
public class Main {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        eagle.fly();
        NonFlyingBirds chicken = new Chicken();
        chicken.canRun();
    }

}
