package Adapter;

public class YesBankAdapter implements BankAPI{
    @Override
    public double getBalance(String accountNumber) {
        return 0;
    }

    @Override
    public boolean sendMonry(String from, String to, double amount) {
        System.out.println("Yes Bank sending monry of amount " + amount + " from " + from + " to " + to);
        return false;
    }
}
