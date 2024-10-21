package genericMethod;

//In generics package -> provided generic types on a class level
//but below provided generics on a method level
public class Pair {

    //static attribute doesn't get tied to obj instead with the class
    public static <T> void doSomething(T something) {
        System.out.println(something);
    }

    //generic method can be at obj level
    public <T> void doSome(T something) {
        System.out.println(something);
    }

    //genetic method can have generic as a return type
    public static <T> T foo (T something) {
        return something;
    }
}
