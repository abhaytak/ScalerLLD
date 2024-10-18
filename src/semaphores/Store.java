package semaphores;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {

    //List<Object> or List<> isn't thread safe, still facing index out of bound issue in removeItem()
    //There might be multiple thread coming to removeItem() and facing index out of bound
    //Our req is, work producer and consumer is parallel, can't compromise that so can't put synchronized keyword or method
    //keen to find till least level where the issue can happen
    //we found the issue in removeItem() and solution is, can have concurrent data structure
    //private List<Object> items;

    //concurrent DS, thread safe, using linked list internally
    //this helped to get the desired output, earlier was getting more than 5 size of consumer and producer
    private ConcurrentLinkedDeque<Object> items;

    Store() {
        //this.items = new ArrayList<>();
        this.items = new ConcurrentLinkedDeque<>();
    }

    public void addItem() {
        System.out.println("Producer production time, current size " + this.items.size());
        this.items.add(new Object());
    }

    public void removeItem() {
        System.out.println("Consumer consuming time, current size " + this.items.size());
        //this.items.remove(this.items.size() - 1);
        this.items.remove();
    }
}
