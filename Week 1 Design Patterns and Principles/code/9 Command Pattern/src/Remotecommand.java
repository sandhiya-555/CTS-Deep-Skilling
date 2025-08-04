public class Remotecommand {

    public Command command;

    public void setcommand(Command command){
        this.command=command;
    }

    public void executecommand(){
        command.execute();
    }
}
