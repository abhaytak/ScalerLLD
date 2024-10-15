package mutex;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //copied the entire code from callables package

        //java provides lock
        Lock lock = new ReentrantLock();

        Value v = new Value();
        //both the task to have same lock
        Adder x = new Adder(v, lock);
        Subtractor y = new Subtractor(v, lock);

        //Thread pool
        ExecutorService ex = Executors.newCachedThreadPool();

        //Future will wait the all threads to complete
        Future<Void> adderFuture = ex.submit(x);
        Future<Void> subtractorFuture = ex.submit(y);

        //Waits if necessary for the computation to complete, and then retrieves its result.
        adderFuture.get();
        subtractorFuture.get();

        System.out.println(v.value);
    }
}
