package pl.coderslab.beans;

import org.springframework.stereotype.Component;

@Component
public class SimpleCustomerLogger implements CustomerLogger {

    @Override
    public void log() {
        System.out.println("<Aktualna data i godzina>: Customer operation");
    }
}
