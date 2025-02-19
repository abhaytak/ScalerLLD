package Builder;

public class Student {
    String name;
    int id;
    int age;
    int gradYear;
    String batch;
    double psp;

    Student(Builder builder) {
        //do validation here
//        if(builder.getAge() > 31)
//            throw new IllegalArgumentException("Age is greater than 31");
//        if(builder.getGradYear() < 2016)
//            throw new IllegalArgumentException("GradYear is less than 2016");
        //validations are done

        //create the obj
        this.age = builder.getAge();
        this.gradYear = builder.getGradYear();
        this.name = builder.getName();
    }

    //creating builder obj here
    public static Builder getBuilder() {
        return new Builder();
    }
}
