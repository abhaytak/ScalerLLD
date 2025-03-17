package Adapter;

public class ICICIBankAPIAdapter implements BankAPI {
    //this class will be working as a adapter
    //someone will tell this is tight coupling, ab khi to karna padega ye kam par achi baat ye hai
    //ki direct main PhonePe class me nhi kar rhe hai

    ICICIBankAPI icicibankAPI = new ICICIBankAPI();
    @Override
    public int checkBalance() {
        return icicibankAPI.findBalance();
    }

    @Override
    public void moneyTransfer() {
        icicibankAPI.fundTransfer();
    }
}
