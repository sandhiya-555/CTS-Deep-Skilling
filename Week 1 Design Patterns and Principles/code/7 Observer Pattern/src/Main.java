public class Main {
    public static void main(String[] args) {
        Stockmarket stocks= new Stockmarket();
        Webapp web= new Webapp("Groww");
        Mobileapp mobile= new Mobileapp("Upstocks");

        stocks.register(web);
        stocks.register(mobile);

        stocks.Setstock("L&T",205);

        stocks.deregister(mobile);

        stocks.Setstock("TVS",300);
    }
}