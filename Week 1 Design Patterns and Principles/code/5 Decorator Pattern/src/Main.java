public class Main {
    public static void main(String[] args) {

        Notifier notifier= new EmailNotifier();

        notifier= new SmsNotifier(notifier);
        notifier= new SlackNotifier(notifier);
        notifier.send("Test successful");
    }
}