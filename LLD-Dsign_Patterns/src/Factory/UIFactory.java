package Factory;

import Factory.components.Button;
import Factory.components.Menu;

public interface UIFactory {
    //THis interface should only contain factory methods.
    //Factory Method: THat returens the object of the corresponding class.

    Button createButton();
    Menu createMenu();
}
