package co.edu.itm.itm_construccion_software.clase2.desginpatterns.strategy;

public class DebitCardPayment implements PaymentStrategy {

  @Override
  public void pay(double amount) {
    System.out.println("Pay " + amount+ " with Debit card");
  }
}
