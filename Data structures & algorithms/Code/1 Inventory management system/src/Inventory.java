import java.sql.SQLOutput;
import java.util.HashMap;

public class Inventory {
    public HashMap<Integer,Product> inventory;

    public Inventory(){
        inventory=new HashMap<>();
    }

    public void addProduct(Product product){
        inventory.put(product.getProductId(),product);
        System.out.println("Product added successfully!");
        System.out.println(product);
    }

    public void updateProduct(int id,String name,int price,int quantity){
        Product product=inventory.get(id);
        if(product==null){
            System.out.println("Enter a valid product id");
        }else{
            product.setProductName(name);
            product.setQuantity(price);
            product.setPrice(quantity);

            System.out.println("Product updated: "+product);
        }
    }

    public void deleteProduct(int id){
        Product product= inventory.get(id);

        if(product==null){
            System.out.println("Enter a valid product id");
        }else{
            inventory.remove(id);
            System.out.println("Product removed successfully!");
        }
    }

    public void displayProducts(){
        for(Product prod: inventory.values()){
            System.out.println(prod);
        }
    }


}
