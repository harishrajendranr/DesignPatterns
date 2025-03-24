package DesignPatternNew.Strategy;

public class Creditcard implements PaymentStrategy {
    public String Cardnumber;

    public Creditcard(String Cardnumber)
    {
        this.Cardnumber = Cardnumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying "+amount+" through Creditcard");
    }
}
