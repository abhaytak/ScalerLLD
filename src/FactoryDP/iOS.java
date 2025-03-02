package FactoryDP;

public class iOS extends Plateform {

    //given the reponsibility to iOS itself to create it's own factory

    @Override
    public UIComponentFactory createUIComponentFactory() {
        return new iOSUIComponentFactory();
    }
}
