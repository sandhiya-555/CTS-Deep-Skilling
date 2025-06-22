import java.util.Arrays;
import java.util.Comparator;

public class SearchDemo {

    public static Product linearSearch(Product[] products, int targetId) {
        for (Product p : products) {
            if (p.productId == targetId)
                return p;
        }
        return null;
    }

    public static Product binarySearch(Product[] products, int targetId) {
        int low = 0, high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (products[mid].productId == targetId)
                return products[mid];
            else if (products[mid].productId < targetId)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(205, "T-Shirt", "Apparel"),
            new Product(309, "Book", "Education"),
            new Product(412, "Smartphone", "Electronics")
        };

        // Linear Search
        System.out.println("Linear Search:");
        Product result1 = linearSearch(products, 205);
        System.out.println(result1 != null ? result1 : "Product not found");

        // Sort for Binary Search
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        // Binary Search
        System.out.println("\nBinary Search:");
        Product result2 = binarySearch(products, 309);
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}
