package service.customer;

public class CustomerService implements ICustomerService {
    CustomerRepository customerRepository = new CustomerRepository();

    @Override
    public List<Customer> selectAllCustomer() {
        return customerRepository.selectAllCustomer();
    }

    @Override
    public Customer selectCustomerById() {
        return customerRepository.selectCustomerById();
    }

    @Override
    public void insertCustomer(Customer customer) {
        customerRepository.insertCustomer(customer);
    }

    @Override
    public void deleteCustomer(String id) {
        customerRepository.deleteCustomer(id);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerRepository.updateCustomer(customer);
    }

    @Override
    public List<Customer> selectCustomerByName(String name) {
        return customerRepository.selectCustomerByName(name);
    }

    @Override
    public int countCustomer() {
        return customerRepository.countCustomer();
    }
}
