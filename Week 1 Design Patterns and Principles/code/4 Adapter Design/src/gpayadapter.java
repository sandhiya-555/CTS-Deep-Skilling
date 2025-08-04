public class gpayadapter implements payment{

    private gpay gp;

    public gpayadapter(gpay gp){
        this.gp=gp;
    }

    @Override
    public void processpayemt(double amt) {
        gp.payg(amt);
    }
}
