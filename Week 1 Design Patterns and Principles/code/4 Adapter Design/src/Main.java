public class Main {
    public static void main(String[] args) {

        payment pay=new gpayadapter(new gpay());
        pay.processpayemt(500);

        payment p1= new paypaladapter(new paypal());
        p1.processpayemt(600);
    }
}