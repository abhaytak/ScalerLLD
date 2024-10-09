package polymorphism.methodhiding;

public class Dog extends Animal {
    public static void canWalk()
    {
        System.out.println("Dog Can walk");
    }

    public void canEat()
    {
        System.out.println("Dog Can eat");
    }
}
