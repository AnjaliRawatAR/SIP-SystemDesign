package Strategy_Pattern;

public class Card_payment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Card Number, CVV and Expiry Date");
    }
}
