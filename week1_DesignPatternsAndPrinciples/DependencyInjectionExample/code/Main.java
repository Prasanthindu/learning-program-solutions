package DependencyInjectionExample;


class CustomerRepositoryImpl implements CustomerRepository {
    public String findCustomerById(String customerId) {
        return "CustomerID: " + customerId + ", Name: John Doe";
    }
}

public class Main {
    public static void main(String[] args) {
        CustomerRepository repository = new CustomerRepositoryImpl();

     
        CustomerService service = new CustomerService(repository);

        service.getCustomerDetails("C101");
    }
}
