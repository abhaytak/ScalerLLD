package polymorphism.runtime.example;

public class Client {
    public static void main(String[] args) {
        C c = new C();
        c.greet();

        //in method overriding behaviour are always associated to obj
        //in normal polymorphism (Animal, Dog) eg here in the proj, M Overriding was't there.
        //that's why behaviour was associated to datatype
        B b = new C();
        b.greet(); //behaviours are associated to obj, output: C calling
        b.BString=""; //attribute are associated to datatype (B)

        A a = new C();
        a.greet();
    }

}
