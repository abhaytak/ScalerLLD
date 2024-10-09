package polymorphism.runtime;

public class Student extends User{
    String university;
    double psp;

    //this method overriding the parent class method
    public void viewDashboard()
    {
        System.out.println("student dashboard");
    }

    //Student can have the login method like super class,
    //eg. there is super class common login method but student can also have separate login
}
