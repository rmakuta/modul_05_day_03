package pl.coderslab.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FileCustomerLogger implements CustomerLogger {

    private String fileName;

    @Autowired
    public FileCustomerLogger(@Qualifier("nazwa") String filename){
        this.fileName = fileName;
    }

    @Override
    public void log() {
        System.out.println("Filname");
    }
}
