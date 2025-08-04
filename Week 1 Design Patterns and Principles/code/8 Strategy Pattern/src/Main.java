public class Main {
    public static void main(String[] args) {
        Paymentcontext payment= new Paymentcontext(new CreditCardPayment());
        payment.processpayment(5000);

        payment= new Paymentcontext(new Paypalpayment());
        payment.processpayment(6000);
    }

}