package Builder;

//here this class is helper class.
//it just acting like a data structure
public class Builder {
    String name;
    int id;
    int age;
    int gradYear;
    String batch;

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public int getGradYear() {
        return gradYear;
    }

    //    public void setGradYear(int gradYear) {
//        this.gradYear = gradYear;
//    }
    public Builder setGradYear(int gradYear) {
        this.gradYear = gradYear;
        return this;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    double psp;


    public Student build() {
        //earlier used to check validation in the student constructor
        //now here the obj is being created, validation can be happen here
        if (this.getAge() > 31)
            throw new IllegalArgumentException("Age is greater than 31");
        if (this.getGradYear() < 2016)
            throw new IllegalArgumentException("GradYear is less than 2016");

        return new Student(this);
    }
}
