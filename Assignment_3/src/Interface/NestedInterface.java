package Interface;
interface Birds{
    public void canFly();
    public interface NonFlyingBird{
        public void canRun();
    }
}

 class Eagles implements Birds{
    @Override
    public void canFly() {
        System.out.println("This bird can fly...");
    }
}

class Chickens implements Birds.NonFlyingBird{
    @Override
    public void canRun() {
        System.out.println("this bird can run...");
    }
}

public class NestedInterface {
    public static void main(String[] args) {
        Birds eagle = new Eagles();
        Birds.NonFlyingBird chicken = new Chickens();
        eagle.canFly();
        chicken.canRun();
    }

}
