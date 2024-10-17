package producerConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();
        Store store = new Store(5);

        //newCachedThreadPool sending multiple threads, that's why output keeps on coming
        //I tried to put newFixedThreadPool(5), single digit fixed thread won't give correct output
        for (int i = 1; i <= 8; ++i) {
            ex.execute(new Producer(store));
        }

        for (int i = 1; i <= 20; ++i) {
            ex.execute(new Consumer(store));
        }

        //The issue with putting synchronized is it will allow only 1 producer and then 1 consumer at a time
        //or more producer produced it, but the requirement was as soon as producer produced, consumer should consume
        //but synchronized won't allow to do that, it more work in a serialized manner
        //more detail in the notebook, synchronized isn't good option, correct option is semaphores
    }
}
