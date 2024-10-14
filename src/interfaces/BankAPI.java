package interfaces;

public interface BankAPI {
    int getBalance(int accNumber);
    void transferMoney(int from, int to, int money);
}
