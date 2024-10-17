package producerConsumer;

public class Consumer implements Runnable {
    private Store store;

    public Consumer(Store st) {
        this.store = st;
    }

    @Override
    public void run() {
        while (true) {
            //suppose getItem()=4
            //may be multiple threads came to if condition and went to removeItem(), index out of bound happened
            //before sync saw this in the output: 'Consumer consuming time, current size 9'
            //which is not possible actual Store size is 5 in the client.java
            //Index -1 out of bounds for length 0 happened, put sync
            synchronized (store) {
                if (store.getItems().size() > 0) {
                    store.removeItem();
                }
            }
        }
    }
}
