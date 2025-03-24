package Decorator;

public class Milk implements Addon {
    Bevarage b;

    Milk(Bevarage b) {
        this.b = b;
    }

    @Override
    public int getCost() {
        System.out.println("Milk layer " + b.getCost());
        return 10 + b.getCost();
    }

    @Override
    public void getDesc() {
        b.getDesc();
        System.out.println("Milk has been added");
    }
}
