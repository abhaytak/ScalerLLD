package interfaces;

public class YesBankAPI implements BankAPI{
    @Override
    public int getBalance(int accNumber) {
        return 0;
    }

    @Override
    public void transferMoney(int from, int to, int money) {
        System.out.println("Money transferred by Yes bank");
    }
}
