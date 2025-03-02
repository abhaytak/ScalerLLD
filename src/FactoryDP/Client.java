package FactoryDP;

import FactoryDP.button.Button;
import FactoryDP.dropdown.Dropdown;
import FactoryDP.menu.Menu;

public class Client {
    public static void main(String[] args) {

        //without design patter and solid principle, it would have like this
//        Plateform p = new Plateform();
//        Button b = p.createButton("ios");


        //right now getting obj of Android or iOS class
        //lets suppose, not receiving the direct obj but receving something in string, code mentioned below
        Plateform p1 = new Android();
        //Plateform p1 = new iOS();
        //these kind of method helping me to create the obj of the co-responding classes
        //run time polymorphism
        UIComponentFactory x1 = p1.createUIComponentFactory();
        Button b1 = x1.createButton();
        Dropdown d1 = x1.createDropdown();
        Menu m1 = x1.createMenu();

        //based on String obj creation
        //if the Android and iOS class isn't created the such case how to do the code?
        Plateform p2 = new Plateform("Android");
        UIComponentFactory x2 = p2.createFactory();
        Button b2 = x2.createButton();
        Dropdown d2 = x2.createDropdown();
        Menu m2 = x2.createMenu();
    }
}
