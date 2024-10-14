package executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        //same code like in package: printNumbersWithThread, there I used multithreading
        //Same code, but I am using it with Thread pool
        //This will be fast compare to normal multithreading

        //providing tasks (printing 1 - 5000) to threads (10)
        //limited threads, useful for longer task
        ExecutorService ex = Executors.newFixedThreadPool(10);
        //want to create another pool then create new obj ex1

        //auto take the threads, numbers are not fixed, useful for shorter task
        //read more by the click of newCachedThreadPool()
        //ExecutorService ex = Executors.newCachedThreadPool();

        for(int i = 1; i <= 5000; i++){
            PrintNumber task = new PrintNumber(i);
            ex.execute(task);
        }
    }
}