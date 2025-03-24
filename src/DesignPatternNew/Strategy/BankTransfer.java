package DesignPatternNew.Strategy;

public class BankTransfer implements PaymentStrategy {
    public String Accountnumber;

    public BankTransfer(String Accountnumber)
    {
        this.Accountnumber = Accountnumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying "+amount+" through BankTransfer");
    }
}
