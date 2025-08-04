public class Main {
    public static void main(String[] args) {

       Product product = new Product(1,"Keyboard",10,20000);

       Inventory inventory= new Inventory();

       inventory.addProduct(product);

       inventory.updateProduct(1,"Mouse",3000,4);

       inventory.deleteProduct(1);
    }
}