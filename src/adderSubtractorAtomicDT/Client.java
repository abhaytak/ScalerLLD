package adderSubtractorAtomicDT;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Atomic Data Structure
        //Copied the call from Adder/Subtractor code which is available in the callables package
        //learn more about atomic in the article, https://baeldung.com/java-atomic-variables

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
    }
}
