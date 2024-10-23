package genericBounds;

import java.util.List;

public class Util {
    //I haven't created this method argument generic, if I am passing List<Dog> obj, compiler doesn't allow
//    public static void printAnimals(List<Animal> animals) {
//        for (Animal animal : animals) {
//            System.out.println(animal.getClass());
//        }

    //creating method argument generic
    //? is wild card, it will allow Animal and who class is extending Animal
    //I can pass the obj and use it
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal.getClass());
        }
        //but I can not able to modify animal obj
        //with wild card ?, we can only do read operations, not write
        //animals.add(new Dog());
        //animals.add(new Animal());
    }

    //instructor showed to use proper T instead of ?
    //but he ignored this and focused only on wild card, ?
    public static <T extends Animal> void printAnimal(List<T> animal) {
        for (T item : animal) {
            System.out.println(item.getClass());
        }
    }
}
