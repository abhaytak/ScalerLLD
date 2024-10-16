package SynchronizationMethod;

public class Value {
    public int value = 0;

    public synchronized void increment(int i) {
        value += i;
    }

    public synchronized void decrement(int d) {
        value -= d;
    }
}
