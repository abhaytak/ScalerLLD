package polymorphism;

public class Client {
    public static void main(String[] args) {

        //I created an obj of child but referred as parent
        Animal a = new Dog();

        //getting the properties and behaviour of datatype (Animal)
        a.color = "brown";
        a.name = "Dog";
        a.canWalk();

        //Type casting, if I want to have members of an obj
        ((Dog) a).bark();
        ((Dog) a).height = 10.0;

        //OR we can create obj of child like this
//        Dog d = (Dog) a;
//        d.bark();
//        d.height = 11.2;

        //questions in chat: which construction it should call first
        Animal b = new Dog();
        //output: Constructor chaining will not be affected, it should call super first and then child

    }
}
