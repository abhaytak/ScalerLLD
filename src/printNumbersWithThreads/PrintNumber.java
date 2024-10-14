package printNumbersWithThreads;

public class PrintNumber implements Runnable {

    int numberToBePrint;
    PrintNumber(int number){
        this.numberToBePrint = number;
    }

    @Override
    public void run() {
        System.out.println("Number " + this.numberToBePrint + ": Thread: " + Thread.currentThread().getName());
    }
}
