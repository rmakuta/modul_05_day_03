package pl.coderslab.beans;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MemoryCustomerRepository implements CustomerRepository {

    private List<Customer> customers = new ArrayList<>();
    private CustomerLogger customerLogger;

    public MemoryCustomerRepository(CustomerLogger customerLogger) {
        this.customerLogger = customerLogger;
    }

    @Override
    public void addCustomer(Customer customer) {
        this.customers.add(customer);
        System.out.print("Customer dodany: ");
        this.customerLogger.log();
    }

    @Override
    public void deleteCustomer(Customer customer) {
        this.customerLogger.log();
    }

    @Override
    public List<Customer> getCustomers() {
        this.customerLogger.log();
        return null;
    }
}
