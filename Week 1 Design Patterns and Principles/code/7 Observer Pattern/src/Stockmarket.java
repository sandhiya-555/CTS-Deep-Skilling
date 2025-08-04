import java.util.*;
public class Stockmarket implements Stock{
   private List<Observer> list = new ArrayList<>();
    private String stock;
    private int price;
    public Observer observer;

    @Override
    public void register(Observer observer) {
        list.add(observer);
    }

    @Override
    public void deregister(Observer observer) {
        list.remove(observer);
    }

    public void notifyObservers(){
        for(Observer obs:list){
            obs.update(stock,price);
        }
    }

    public void Setstock(String stock, int price){
        this.stock=stock;
        this.price=price;
        System.out.println("Stockname: "+stock+" Price: "+price);

        notifyObservers();

    }
}
