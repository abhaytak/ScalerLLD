package semaphores;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    private Store store;
    private Semaphore prodSema;
    private Semaphore consSema;

    public Consumer(Store st, Semaphore prodSema, Semaphore consSema) {
        this.store = st;
        this.prodSema = prodSema;
        this.consSema = consSema;
    }

    @Override
    public void run() {
        while (true) {
            //critical section
            try {
                consSema.acquire(); //wait here until it's not finding one
                Thread.sleep(100); //optional, just to slow down process and read the output
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.removeItem();
            prodSema.release();
        }
    }
}
