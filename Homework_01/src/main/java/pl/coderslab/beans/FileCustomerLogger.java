package pl.coderslab.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class FileCustomerLogger implements CustomerLogger {

    private String filename;

    @Override
    public void log() {
        System.out.println("Filname");
    }
}
