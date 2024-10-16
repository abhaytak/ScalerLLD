package SynchronizationMethod;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Value val;

    Adder(Value value) {
        this.val = value;
    }

    @Override
    public Void call() {
        for (int i = 1; i <= 5000000; i++) {
            //critical section
            System.out.println("Adder: " + i); //just to check how context switching working, tried <=100

            //lock happening on obj
            val.increment(i);
        }
        return null;
    }
}
