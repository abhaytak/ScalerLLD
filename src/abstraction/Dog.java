package abstraction;

public class Dog extends Animal{ //implements walker

    //I only extends the Animal nothing else
    //and I got error" Class 'Dog' must either be declared abstract or implement abstract method 'walk()' in 'Animal'

    //if I create a interface 'walker' and implements 'walker' here which having void walk1()
    //Dog is abstract, I do not need to give implementation of walk1() here bcz I can't create obj of abstract class Dog
    //But Dog is normal class which is right now then I should have walk1() implementation

    //implementing abstract methods
    @Override
    void walk() {
        System.out.println("Dog walk");
    }
    @Override
    void makeSound() {
        System.out.println("Dog makeSound");
    }

    //Interface implementation
//    @Override
//    public void walk1() {
//        System.out.println("Dog walk1");
//    }
}
