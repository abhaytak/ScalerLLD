package FactoryDP;

import FactoryDP.button.Button;
import FactoryDP.button.iOSButton;
import FactoryDP.dropdown.Dropdown;
import FactoryDP.dropdown.iOSDropdown;
import FactoryDP.menu.Menu;
import FactoryDP.menu.iOSMenu;

public class iOSUIComponentFactory implements UIComponentFactory {
    @Override
    public Menu createMenu() {
        return new iOSMenu();
    }

    @Override
    public Button createButton() {
        return new iOSButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new iOSDropdown();
    }
}
