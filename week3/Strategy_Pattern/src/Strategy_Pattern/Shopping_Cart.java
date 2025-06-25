package Strategy_Pattern;

public class Shopping_Cart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void CheckOut(int amount){
        if(paymentStrategy == null){
            System.out.println("Set the Payment Strategy");
        }else{
            paymentStrategy.pay(amount);
        }
    }
}
