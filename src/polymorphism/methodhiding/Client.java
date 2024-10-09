package polymorphism.methodhiding;

public class Client {
    public static void main(String[] args) {
       Animal a1 = new Animal();
       Animal a2 = new Dog();

       //straight ans, animal method will come
       a1.canEat();

       //straight ans, animal method will come
       a1.canWalk();

       //as per the method overriding, behaviour is associated to an obj, dog will come
       a2.canEat();

        //Method Hiding
        //as per the rule its method overriding, behaviour should be associated to an obj
        //but both class canWalk is static methods so method hiding comes
        //child class canWalk is hidden by the super class canWalk, animal will come
       a2.canWalk();
       //as per my knowledge as soon as Animal class loads, Animal static method got executed before Dog
        //so it doesn't consider the child class canWalk()
    }
}
