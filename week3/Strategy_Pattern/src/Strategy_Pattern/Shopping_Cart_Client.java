package Strategy_Pattern;

public class Shopping_Cart_Client {
    public static void main(String[] args) {
        PaymentStrategy p = new Card_payment();
        Shopping_Cart cart = new Shopping_Cart();
        cart.setPaymentStrategy(p);
        cart.CheckOut(1000);

        cart.setPaymentStrategy(new Paypal_payment());
        cart.CheckOut(120);

        cart.setPaymentStrategy(null);
        cart.CheckOut(120);

    }
}
