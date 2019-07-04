package pl.coderslab.beans;

import java.util.List;

public interface CustomerRepository {

    void addCustomer(Customer customer);
    void deleteCustomer(Customer customer);
    List<Customer> getCustomers();
}
