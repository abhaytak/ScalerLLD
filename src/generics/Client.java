package generics;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        //Generics
        Pair<Integer, String> p1 = new Pair<>();

        //by doing this I am making mistake, compile time error
        //Integer e = p1.getSecond();

        String s = p1.getSecond();
        p1.setSecond(3);
//------------------------------------------------------------------------------
        //Raw types

        //HashMap<> take the generic params
        //Called Raw types feature of before Java 5
        //key: Object type, value: Object type
        //this used to happen before generics came
        //this is still exist bcz of backward compatibility -> phele ke likhe code fat na jaye
        HashMap hm = new HashMap();
        hm.put("Abhay", 50.0);
        hm.put(50.0, "Abhay");

        //can use the pair like this
        Pair p2 = new Pair();

    }
}
