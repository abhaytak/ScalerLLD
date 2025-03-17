package Adapter;

public class PhonePe {
    BankAPI bankAPI;

    //PhonePe will use only bankAPI obj to avoid tight coupling
    PhonePe(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
    }

//    void getBalance()
//    {
//        this.bankAPI.checkBalance();
//    }
}
