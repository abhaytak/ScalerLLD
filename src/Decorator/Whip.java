package Decorator;

public class Whip implements Addon {
    //need to add whip over a Bevarage
    Bevarage b;

    Whip(Bevarage b) {
        this.b = b;
    }

    @Override
    public int getCost() {
        System.out.println("Whip layer " + b.getCost());
        return 20 + b.getCost();
    }

    @Override
    public void getDesc() {
        b.getDesc();
        System.out.println("Whip has been added");
    }
}
