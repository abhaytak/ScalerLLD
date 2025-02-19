package Builder;

public class Client {
    public static void main(String[] args) {

        //Builder b = new Builder();

        //another way to create obj with much readable and we know that student will use the builder obj
        //so getting the object from student itself
        //anyway above obj creation also absolutely work
//        Builder b = Student.getBuilder();
//        b.setAge(31);
//        b.setGradYear(2016);
//        b.setName("Abhay");

        //whatever were done above was builder now whatever doing below is beutifying
        //can't able to see that builder class is involved, everywhere student class we can see
        Student s = Student.getBuilder()
                .setAge(31)
                .setGradYear(2016)
                .setName("Abhay")
                .build();


        //Student s = new Student(b);
        //Student s = b.build();
    }
}
