package DesignPatternNew.Strategy;

public class Paypal implements PaymentStrategy{
    public String Email;

    public Paypal(String Email)
    {
        this.Email = Email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying "+amount+" through paypal");
    }
}
