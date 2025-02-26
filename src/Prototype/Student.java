package Prototype;

public class Student implements Prototype<Student> {
    int id;
    String name;
    double psp;

    //keep the default constructor so client won't face any issue.

//    directly I don't want to give access to these obj, call the copy(), eventually it's calling the constructor
//    private Student(Student other)
//    {
//        this.id = other.id;
//        this.name = other.name;
//        this.psp = other.psp;
//    }

    @Override

    //below code can be access by the copy constructor also but to get actual meaning of copy(), did below.
    public Student copy() {
        //Student s = new Student(this);
        Student s = new Student();

        s.id = this.id;
        s.name = this.name;
        s.psp = this.psp;
        return s;
    }
}
