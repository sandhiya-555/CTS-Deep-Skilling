public class Lightoncommand implements Command{

    public Light light;

    public Lightoncommand(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
        light.Lighton();
    }
}
