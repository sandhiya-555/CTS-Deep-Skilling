public class Order {
    int orderId;
    String customerName;
    int totalPrice;
    public Order(int orderId,String customerName,int totalPrice){
        this.orderId=orderId;
        this.customerName=customerName;
        this.totalPrice=totalPrice;
    }

    public void display(){
        System.out.println("Order ID: " + orderId + ", Name: " + customerName + ", Price:" + totalPrice);
    }
}
