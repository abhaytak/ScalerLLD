package Prototype;

public class Client {
    public static void fillRegistry(StudentRegistry studentRegistry)
    {
        Student apr23Student = new Student();
        apr23Student.name = "temp";
        apr23Student.psp = 100.0;

        studentRegistry.register("Apr23Student", apr23Student);
        //similarily we can register more in a same way
    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student s = new Student();
        s.psp = 12.0;
        s.name = "Abhay";

        //here the responsibility of object to create the copy
        Student s1 = s.copy();


        //want to get the copy
        //this returning the direct obj which I stored, how to avoid this bcz direct obj mean directly updating in actual address
        Student s2 = studentRegistry.get("Apr23Student");

        //remove copy from below and get copy from the get() itself
        //anyhow we are doing copy here, but what before this step, obj got changed at above step by client!
        //Student s3 = s2.copy();
    }
}
