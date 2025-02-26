package Prototype;

public class IntelligentStudent extends Student {
    int iq;

//    IntelligentStudent(IntelligentStudent other) {
//        //for rest assignment call
//        super();
//        this.id = other.id;
//    }

    @Override
    public IntelligentStudent copy() {
        //IntelligentStudent is = new IntelligentStudent(this);
        IntelligentStudent is = new IntelligentStudent();
        is.id = this.id;
        is.name = this.name;
        is.psp = this.psp;
        is.iq = this.iq;
        return is;
    }
}
