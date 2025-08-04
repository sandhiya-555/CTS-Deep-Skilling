public class Paymentcontext {
    private  PaymentStrategy strategy;

    public Paymentcontext(PaymentStrategy strategy){
        this.strategy=strategy;
    }

    public void processpayment(int amount){
        if(strategy==null){
            System.out.println("No methos is selected!");
        }else{
            strategy.pay(amount);
        }
    }
}
