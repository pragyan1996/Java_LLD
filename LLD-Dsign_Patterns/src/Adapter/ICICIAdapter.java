package Adapter;

public class ICICIAdapter implements BankAPI{
    @Override
    public double getBalance(String accountNumber) {
        return 100;
    }

    @Override
    public boolean sendMonry(String from, String to, double amount) {
        System.out.println("ICICI sending monry of amount " + amount + " from " + from + " to " + to);
        return false;
    }
}
