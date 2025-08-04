public class Main {
    public static void main(String[] args) {
        System.out.println("First call");
        Image img= new ProxyImage("Img1.jpg");
        img.display();

        System.out.println("Second call");
        img.display();
    }
}