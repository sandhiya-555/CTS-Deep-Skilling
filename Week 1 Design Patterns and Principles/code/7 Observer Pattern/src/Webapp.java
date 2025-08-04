public class Webapp implements Observer{
private String appname;

    public Webapp(String appname){
        this.appname=  appname;
    }
    public void update(String stock, int price){
        System.out.println("Webapp "+appname+" received updated stock "+stock+" Price: "+price);
    }
}
