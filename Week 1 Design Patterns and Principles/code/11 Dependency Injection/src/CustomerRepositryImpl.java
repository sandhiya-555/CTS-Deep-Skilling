public class CustomerRepositryImpl implements CustomerRepositry{



    public Customer findCustomerById(int id){
        return new Customer("yash",id,200);
    }
}
