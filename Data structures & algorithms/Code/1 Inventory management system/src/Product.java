public class Product {
    public int productId;
    public String productName;
    public int quantity;
    public int price;

    public Product(int productId,String productName,int quantity,int price){
        this.productId=productId;
        this.productName=productName;
        this.price=price;
        this.quantity=quantity;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductId() {
        return productId;
    }

    public int getPrice() {
        return price;
    }

    public String toString(){
        return "Product: "+productName+" ProductId: "+productId+" Quantity: "+quantity+" Price: "+price;
    }
}
