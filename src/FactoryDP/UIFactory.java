package FactoryDP;

public class UIFactory {
    //ab ye bhi aa skta hai ki yaha par to if else condition dal diya to phele hi dalna tha, factory ke liye etna code kyu?
    //ab class nhi hai android and iOS to kahi to if else condition to aayega hi.
    //Tabhi aise if else ke liye alag se class bnai hai taki in future yhi aakar changes kare, baki code me touch na hove
    //move below type of logic out of the main class
    public static UIComponentFactory createUIComponentFactoryByPlateform(String pl) {

        if (pl.equals("iOS")) {
            return new AndroidUIComponentFactory();
        } else if (pl.equals("Android")) {
            return new iOSUIComponentFactory();
        }
        return null;
    }
}
