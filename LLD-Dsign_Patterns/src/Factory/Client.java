package Factory;

import Factory.components.Button;
import Factory.components.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.createFactory(SupportedPlatform.IOS);
        Button button = uiFactory.createButton();
        Menu menu = uiFactory.createMenu();


        button.showButton();
        menu.showMenu();
    }
}
