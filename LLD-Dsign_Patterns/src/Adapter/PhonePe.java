package Adapter;

public class PhonePe {
    public static void main(String[] args) {
        BankAPI bankAPI = new YesBankAdapter();
        String rajatAcc = "1234";
        String sharmaAcc = "4567";

        double amt = 100;

        bankAPI.sendMonry(rajatAcc, sharmaAcc, amt);
    }


}
