public class Customer {
    public String name;
    public int id;
    public int points;

    public Customer(String name,int id,int points){
        this.name=name;
        this.id=id;
        this.points=points;
    }

    public int getId() {
        return id;
    }

    public int getPoints() {
        return points;
    }

    public String getName() {
        return name;
    }
}
