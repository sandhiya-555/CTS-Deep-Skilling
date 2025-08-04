public class CreditCardPayment implements PaymentStrategy{

    public void pay(int amount){
        System.out.println("Amount "+amount+" paid using credit card");
    }
}
