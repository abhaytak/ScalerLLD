package genericMethod;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        //generic method at class level, using static
        Pair.doSomething("Microsoft");

        //generic method at a obj level
        Pair p1 = new Pair();
        p1.doSome("Microsoft");

        //return type also a generic
        //compile time error, passed Int in arg return type will be Int. String can't store it
        //String result = Pair.foo(1);
        Integer result = Pair.foo(1);
        System.out.println(result);
    }
}
