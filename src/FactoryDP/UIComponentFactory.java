package FactoryDP;

import FactoryDP.button.Button;
import FactoryDP.dropdown.Dropdown;
import FactoryDP.menu.Menu;

public interface UIComponentFactory {
    public Button createButton();
    public Menu createMenu();
    public Dropdown createDropdown();
}
