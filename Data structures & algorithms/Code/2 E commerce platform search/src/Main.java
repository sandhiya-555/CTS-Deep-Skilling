import java.util.*;
public class Main {
    public static void main(String[] args) {

       Product [] prod= {
               new Product(105, "Keyboard", 10,1000),
               new Product(101, "Laptop", 10,2000),
               new Product(110, "Chair", 10,3000),
               new Product(102, "Mouse", 10,4000)
       };

       Product.LinearSearch(prod,110);
        Arrays.sort(prod, Comparator.comparingInt(Product::getProductId));
        Product.Binarysearch(prod,101);


    }
}