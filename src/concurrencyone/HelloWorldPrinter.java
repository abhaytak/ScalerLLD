package concurrencyone;

public class HelloWorldPrinter implements Runnable {

    public void doSomething(){
        System.out.println("Do something " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        //within this run method, define the task
        System.out.println("Hello World! " + Thread.currentThread().getName());

        //doSomething() called here, what I think it will use same thread or different?
        doSomething();
        //output: same thread will be used because that is running run()
    }
}
