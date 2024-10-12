package abstraction;

public class Client {
    public static void main(String[] args) {
        //This can't be done: Animal is abstract can not be instantiated
        //Animal a = new Animal();

        //normal polymorphism, behaviour and attributes are associated to datatype Animal - my thought
        //cross-check in day 108 class in notebook
        Animal a = new Dog();
        a.eat();
        a.walk();
        a.makeSound();
        a.eyesType = 1;

//        Dog d = (Dog) a;
//        d.walk1();
    }
}
