public class Main {
    public static void main(String[] args) {
        Computer comp= new Computer.Builder("intel",32,500).build();
        comp.showSpec();

    }
}