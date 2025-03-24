package DesignPatternNew.Strategy;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy banktransfer = new BankTransfer("9870324809238");
        PaymentStrategy creditcard = new Creditcard("323223");
        PaymentStrategy paypal = new Paypal("Manoj@yahoo.com");
        PaymentContext pc = new PaymentContext(paypal);
        pc.MakePayment(1000);
        pc.setPaymentStrategy(creditcard);
        pc.MakePayment(3000);
    }
}
