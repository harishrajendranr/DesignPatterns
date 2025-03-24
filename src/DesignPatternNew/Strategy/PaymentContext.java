package DesignPatternNew.Strategy;

public class PaymentContext {
    public PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy)
    {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy)
    {
        this.paymentStrategy = paymentStrategy;
    }
    public void MakePayment(int amount)
    {
        paymentStrategy.pay(amount);
    }
}
