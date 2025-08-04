import java.sql.SQLOutput;

public class CustomerService {
    private CustomerRepositryImpl customerrepo;

    public CustomerService(CustomerRepositryImpl customerrepo){
        this.customerrepo=customerrepo;
    }

    public void displaycustomer(int id){
        Customer cus= customerrepo.findCustomerById(id);
        System.out.println("Name"+cus.getName());
        System.out.println("Id:"+cus.getId());
        System.out.println("Points:"+cus.getPoints());
    }

}
