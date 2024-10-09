package polymorphism.compiletime;

import java.util.List;

public class Calculator {

    //method names are same but arguments are different, method overloading
    //same arguments with different return type not allowed, compiler gets confused which to call.
    public int add(int a, int b) {
        return a+b;
    }

    public int add(int a, int b, int c) {
        return a+b+c;
    }

    public int add(List<Integer> list){
        int sum = 0;
        for(int i = 0; i < list.size(); i++)
        {
            sum += list.get(i);
        }
        return sum;
    }
}
