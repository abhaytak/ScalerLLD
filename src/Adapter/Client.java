package Adapter;

public class Client {
    public static void main(String[] args) {
        BankAPI b = new YesBankAPIAdapter();
        PhonePe phonePe1 = new PhonePe(b);
//        phonePe1.getBalance();

        //later if want's to change bank then just change the adapter class
    }
}
