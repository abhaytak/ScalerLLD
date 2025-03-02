package FactoryDP;

import FactoryDP.button.AndroidButton;
import FactoryDP.button.Button;
import FactoryDP.button.iOSButton;

public class Plateform {

    Plateform() {

    }

    private String pl;

    Plateform(String pl) {
        this.pl = pl;
    }

    //these methods are common for all the plateforms (android, ios, etc.)
    public void setTheme() {
        System.out.println("Set a theme!");
    }

    public void setRefreshRate() {
        System.out.println("Set a refresh rate!");
    }

    //without design patter and solid principle, it would have like this
    //basic one
//    public Button createButton(String plateform) {
//        if (plateform.equals("plateform")) {
//            return new AndroidButton();
//        } else if (plateform.equals("ios")) {
//            return new iOSButton();
//        }
//        return null;
//    }

    //same methods for menu and dropdown

    //----------------------------------------------------------------------------------

    public UIComponentFactory createUIComponentFactory() {
        return null;
    }


    //if the Android and iOS class isn't created the such case how to do the code?
    public UIComponentFactory createFactory() {
        return UIFactory.createUIComponentFactoryByPlateform(this.pl);
    }
}
