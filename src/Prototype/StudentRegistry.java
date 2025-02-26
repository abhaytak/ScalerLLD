package Prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> map = new HashMap<>();

    //somebody wants to stores the obj
    public void register(String key, Student s) {
        map.put(key, s);
    }

    public Student get(String key) {
        //why kept .copy() explained in client.java
        return map.get(key).copy();
    }
}
