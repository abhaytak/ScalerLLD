package interfaces;

public class PhonePe {
    BankAPI bankAPI;

    //constructor
    PhonePe(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
    }

    //PhonePe own method
    public int checkBalance()
    {
        return bankAPI.getBalance(12);
    }

    public void balanceTransfer()
    {
        bankAPI.transferMoney(1,2,100);
    }

}
