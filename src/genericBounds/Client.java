package genericBounds;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        //Can not pass dogs here as this method argument expect List<Animal> obj
        //Util.printAnimals(dogs);

        //created method argument generic so that It can take animal or who is extending animal
        //here Dog class extends Animal, dogs obj allowed here
        Util.printAnimals(dogs);

        //it is also possible
        List<? extends Animal> animals = new ArrayList<Dog>();
    }
}
