package Factory.components;

public class IosButton implements Button{
    @Override
    public void showButton() {
        System.out.println("This is ios button");
    }
}
