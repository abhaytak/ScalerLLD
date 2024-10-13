package concurrencyone;

public class Client {
    public static void main(String[] args) {
        //this is eg of multithreading
        HelloWorldPrinter task1 = new HelloWorldPrinter();
        Thread t = new Thread(task1);
        t.start();

        //by doing this see the output, I will notice context switching b/w threads
        System.out.println("Thread : " + Thread.currentThread().getName());
    }
}
