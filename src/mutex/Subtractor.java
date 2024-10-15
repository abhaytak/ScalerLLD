package mutex;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    private Value val;
    private Lock lock;

    Subtractor(Value value, Lock lock) {
        this.val = value;
        this.lock = lock;
    }

    @Override
    public Void call() {
        for (int i = 1; i <= 100; i++) {
            //critical section
            lock.lock();
            System.out.println("Subtractor " + i); //just to check how context switching working, tried <=100
            this.val.value -= i;
            lock.unlock();
        }
        return null;
    }
}
