package polymorphism.compiletime;

public class Client {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(1,2));
        System.out.println(c.add(1,2,3));
    }
}
