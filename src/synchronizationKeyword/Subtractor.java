package synchronizationKeyword;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    private Value val;

    Subtractor(Value value) {
        this.val = value;
    }

    @Override
    public Void call() {
        for (int i = 1; i <= 500000; i++) {
            //critical section
            //lock happening on keyword
            synchronized (this.val) {
                System.out.println("Subtractor " + i); //just to check how context switching working, tried <=100
                this.val.value -= i;
            }
        }
        return null;
    }
}