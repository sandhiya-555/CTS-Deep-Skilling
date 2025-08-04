public class paypaladapter implements payment{

    private paypal pp;

    public paypaladapter(paypal pp){
        this.pp=pp;
    }

    @Override
    public void processpayemt(double amt) {
        pp.palpay(amt);
    }
}
