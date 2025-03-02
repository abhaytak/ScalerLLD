package FactoryDP;

public class Android extends Plateform {

    //given the reponsibility to Android itself to create it's own factory
    @Override
    public UIComponentFactory createUIComponentFactory() {
        return new AndroidUIComponentFactory();
    }
}
