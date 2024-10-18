package semaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {

        //copied the code from producerConsumer
        ExecutorService ex = Executors.newCachedThreadPool();

        //have to maintain the counts of producer and consumer
        //initial state
        Semaphore prodSema = new Semaphore(5);
        Semaphore consSema = new Semaphore(0);

        Store store = new Store();

        for (int i = 1; i <= 8; ++i) {
            ex.execute(new Producer(store, prodSema, consSema));
        }

        for (int i = 1; i <= 20; ++i) {
            ex.execute(new Consumer(store, prodSema, consSema));
        }
    }
}
