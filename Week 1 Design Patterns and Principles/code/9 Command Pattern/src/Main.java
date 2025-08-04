public class Main {
    public static void main(String[] args) {

        Light light= new Light();

        Lightoncommand lighton= new Lightoncommand(light);
        Lightoffcommand lightoff=new Lightoffcommand(light);

        Remotecommand command= new Remotecommand();
        command.setcommand(lighton);
        command.executecommand();

        command.setcommand(lightoff);

        command.executecommand();
    }
}