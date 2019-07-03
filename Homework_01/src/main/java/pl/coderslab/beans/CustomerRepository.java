package pl.coderslab.beans;

import java.util.List;

public interface CustomerRepository {

    void addCustomer(SimpleCustomerLogger customer);
    void deleteCustomer();
    List getCustomers();
}
