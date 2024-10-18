package semaphores;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private Store store;

    //why 2 Semaphore, descementing the count of prodSema and incrementing the count of consSema
    private Semaphore prodSema;
    private Semaphore consSema;

    Producer(Store st, Semaphore prodSem, Semaphore consSem) {
        this.store = st;
        this.prodSema = prodSem;
        this.consSema = consSem;
    }

    @Override
    public void run() {
        while (true) {
            //critical section
            try {
                //if you are having availability then give me
                //decrease the count of producer
                //without try catch acquire() giving compile time error
                prodSema.acquire(); //wait here until it's not finding one
                Thread.sleep(100); //optional, just to slow down process and read the output
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            store.addItem();

            //increase the count of consumer
            consSema.release();
        }
    }
}
