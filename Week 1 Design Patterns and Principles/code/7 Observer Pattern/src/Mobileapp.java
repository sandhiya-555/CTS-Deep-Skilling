public class Mobileapp implements Observer{
    private String appname;

    public Mobileapp(String appname){
        this.appname=  appname;
    }
    public void update(String stock, int price){
        System.out.println("Mobileapp "+appname+" received updated stock "+stock+" Price: "+price);
    }
}