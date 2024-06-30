package Factory;

import Factory.components.AndroidButton;
import Factory.components.AndroidMenu;
import Factory.components.Button;
import Factory.components.Menu;

public class AndroidUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
