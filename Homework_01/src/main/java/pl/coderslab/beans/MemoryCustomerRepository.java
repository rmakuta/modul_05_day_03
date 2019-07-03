package pl.coderslab.beans;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MemoryCustomerRepository implements CustomerRepository {

    private List<SimpleCustomerLogger> customers;
    private SimpleCustomerLogger simpleCustomerLogger;

    public MemoryCustomerRepository(SimpleCustomerLogger simpleCustomerLogger) {
        this.customers = new ArrayList<>();
        this.simpleCustomerLogger = simpleCustomerLogger;
    }

    @Override
    public void addCustomer(SimpleCustomerLogger customer) {
        customers.add(customer);
        System.out.print("Customer dodany: ");
        this.simpleCustomerLogger.log();
    }

    @Override
    public void deleteCustomer() {
        this.simpleCustomerLogger.log();
    }

    @Override
    public List getCustomers() {
        this.simpleCustomerLogger.log();
        return null;
    }
}
