package polymorphism.runtime;

public class User {
    String name;
    String password;

    public void login(){
        System.out.println("logging");
    }

    public void viewDashboard()
    {
        System.out.println("user dashboard");
    }
}
