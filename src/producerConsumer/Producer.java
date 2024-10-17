package producerConsumer;

public class Producer implements Runnable {
    private Store store;

    Producer(Store st) {
        this.store = st;
    }

    @Override
    public void run() {
        while (true) {
            //Index -1 out of bounds for length 0 happened, put sync
            //suppose getItem()=3, getMaxSize=5
            //may be multiple threads came to if condition and went for adding the item
            synchronized (store) {
                if (store.getItems().size() < store.getMaxSize()) {
                    store.addItem();
                }
            }
        }
    }
}
