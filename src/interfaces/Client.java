package interfaces;

public class Client {
    public static void main(String[] args) {
        //this is also called abstraction, interfaces help us to achieve abstractions
//        BankAPI bankAPI = new YesBankAPI(); //letter if RBI banned this bank
        BankAPI bankAPI = new ICICIAPI(); //with only this simple change, I am targeting to another bank1
        PhonePe phonePe = new PhonePe(bankAPI);
        phonePe.checkBalance();
        phonePe.balanceTransfer();
    }
}
