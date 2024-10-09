package polymorphism.runtime;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        //method overriding or runtime polymorphism
        student.viewDashboard();
    }
}
