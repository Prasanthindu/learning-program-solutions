package DependencyInjectionExample;

public class CustomerService {
    private CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void getCustomerDetails(String customerId) {
        String customer = repository.findCustomerById(customerId);
        System.out.println("Customer Details: " + customer);
    }
}
