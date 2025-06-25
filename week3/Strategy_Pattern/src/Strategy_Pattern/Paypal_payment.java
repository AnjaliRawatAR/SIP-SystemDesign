package Strategy_Pattern;

public class Paypal_payment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Bank Account and UPI");
    }
}
