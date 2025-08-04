public class SmsNotifier extends NotifierDecorator{

    public SmsNotifier(Notifier notifier){
        super(notifier);
    }

    public void send(String message){
        super.send(message);
        System.out.println("Sending SMS:"+message);
    }
}
