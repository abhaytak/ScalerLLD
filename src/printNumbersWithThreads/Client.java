package printNumbersWithThreads;

public class Client {
    public static void main(String[] args) {
        //multithreading
        //The task is to print 5000 numbers but using different threads not with same thread
        //to achieve this I have to create 5000 obj and pass it to thread, so a new thread will create for new print number
        for(int i = 1; i <= 5000; i++){
            PrintNumber task = new PrintNumber(i);
            Thread thread = new Thread(task);
            thread.start();
        }
    }
}
