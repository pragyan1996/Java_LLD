package Adapter;

public interface BankAPI {
    double getBalance(String accountNumber);
    boolean sendMonry(String from, String to, double amount);
}
