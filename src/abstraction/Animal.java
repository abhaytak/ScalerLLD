package abstraction;

public abstract class Animal {
    //abstract support to have property
    int eyesType;

    //abstract can have its own implementation
    void eat(){
        System.out.println("All animal can eat");
    }

    //This can't be done: abstract method can't have body
//    abstract void run(){
//
//    }

    abstract void walk();
    abstract void makeSound();
}
