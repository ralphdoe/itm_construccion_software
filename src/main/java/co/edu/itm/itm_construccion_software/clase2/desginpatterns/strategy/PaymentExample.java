package co.edu.itm.itm_construccion_software.clase2.desginpatterns.strategy;

public class PaymentExample {

  public static void main(String[] args) {
    PaymentContext context = new PaymentContext();
    context.setPaymentStrategy(new CreditCardPayment());
    context.pay(20000D);

    context.setPaymentStrategy(new DebitCardPayment());
    context.pay(100000D);
  }

}
