public class Paypalpayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Amount "+amount+" paid using Paypal");
    }
}
