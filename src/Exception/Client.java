package Exception;

public class Client {
    //RUNTIME EXCEPTION OR UNCHECKED: DISCLAIMER IS NOT GIVEN
//    public static void main(String[] args) {
//        Student s = new Student();
//        s.doSomething();
//    }

    public static void main(String[] args) throws ClassNotFoundException {
        Student s = new Student();

        //giving error, unhandled exception
        //two options whether handle it of main also has to throw it further
        //s.doSomething(10);

        //main class throwing is further by throws ClassNotFoundException
        s.doSomething(10);
    }
}
