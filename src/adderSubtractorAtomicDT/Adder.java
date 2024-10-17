package adderSubtractorAtomicDT;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private Value val;

    Adder(Value value) {
        this.val = value;
    }

    @Override
    public Void call() {
        for (int i = 1; i <= 5000; i++) {
            //+= i, takes 3 instructions to complete
            //mine words
            //atomic ds, method addAndGet() is so atomic which take 1 or 2 instructions
            //these method are created in such a way that there will not any optimization
            //thread safe, result will always be 0 without any lock
            this.val.value.addAndGet(i);
        }
        return null;
    }
}
