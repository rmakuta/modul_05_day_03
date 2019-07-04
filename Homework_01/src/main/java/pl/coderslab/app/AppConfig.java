package pl.coderslab.app;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.coderslab.beans.CustomerLogger;
import pl.coderslab.beans.FileCustomerLogger;
import pl.coderslab.beans.MemoryCustomerRepository;
import pl.coderslab.beans.SimpleCustomerLogger;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    public SimpleCustomerLogger simpleCustomerLogger(){
        return new SimpleCustomerLogger();
    }

    @Bean("nazwa")
    public String fileName(){
        return "cosTamCosTam";
    }

    @Bean
    public MemoryCustomerRepository memoryCustomerRepository(){
        return new MemoryCustomerRepository(simpleCustomerLogger());
    }
}
