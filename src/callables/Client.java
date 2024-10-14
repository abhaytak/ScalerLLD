package callables;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //Actually callables eg was the merge sort which instructor showed in the class, I haven't code.
        //Callable mean = runnable + return data
        //Below code we're not returning anything, but I need to wait for the process to complete, that's why I used

        Value v = new Value();
        Adder x = new Adder(v);
        Subtractor y = new Subtractor(v);

        //Thread pool
        ExecutorService ex = Executors.newCachedThreadPool();

        //Future will wait the all threads to complete
        Future<Void> adderFuture = ex.submit(x);
        Future<Void> subtractorFuture = ex.submit(y);

        //Waits if necessary for the computation to complete, and then retrieves its result.
        adderFuture.get();
        subtractorFuture.get();

        System.out.println(v.value);

        //if loop running for 100 times then result 0 coming as expected
        //But when loop running for 5000 times then very random result coming
        //Because they are working on same shared variable value.
        //This is synchronization issue, covered in Day 121 class.
    }
}
