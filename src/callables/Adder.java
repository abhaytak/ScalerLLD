package callables;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private Value val;

    Adder(Value value){
        this.val = value;
    }

    @Override
    public Void call() {
        for(int i = 1; i <= 5000; i++){
            this.val.value += i;
        }
        return null;
    }
}
