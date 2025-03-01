package co.edu.itm.itm_construccion_software.clase2.desginpatterns.strategy;

public class PaymentContext {
  private PaymentStrategy paymentStrategy;

  public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
    this.paymentStrategy = paymentStrategy;
  }

  public void pay(double amount) {
    paymentStrategy.pay(amount);
  }
}
