public class Lightoffcommand implements Command{

    public Light light;

    public Lightoffcommand(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
        light.Lightoff();
    }
}
