package Factory;

import Factory.components.Button;
import Factory.components.IosButton;
import Factory.components.IosMenu;
import Factory.components.Menu;

public class IosUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }
}
