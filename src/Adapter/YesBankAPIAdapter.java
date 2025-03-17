package Adapter;

public class YesBankAPIAdapter implements BankAPI{
    //this class will be working as a adapter
    //someone will tell this is tight coupling, ab khi to karna padega ye kam par achi baat ye hai
    //ki direct main PhonePe class me nhi kar rhe hai

    YesBankAPI yesBankAPI = new YesBankAPI();

    @Override
    public int checkBalance() {
        return yesBankAPI.getBalance();
    }

    @Override
    public void moneyTransfer() {
        yesBankAPI.transferMoney();
    }
}
