public class Main {
    public static void main(String[] args) {


        CustomerRepositryImpl cusrep= new CustomerRepositryImpl();

        CustomerService service= new CustomerService(cusrep);
        service.displaycustomer(1);
    }
}