package FactoryDP;

import FactoryDP.button.AndroidButton;
import FactoryDP.button.Button;
import FactoryDP.dropdown.AndroidDropdown;
import FactoryDP.dropdown.Dropdown;
import FactoryDP.menu.AndroidMenu;
import FactoryDP.menu.Menu;

public class AndroidUIComponentFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}
