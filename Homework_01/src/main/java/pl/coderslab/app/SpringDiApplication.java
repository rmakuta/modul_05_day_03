package pl.coderslab.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.beans.FileCustomerLogger;
import pl.coderslab.beans.MemoryCustomerRepository;
import pl.coderslab.beans.SimpleCustomerLogger;

public class SpringDiApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        SimpleCustomerLogger simpleCustomerLogger = (SimpleCustomerLogger) context.getBean("simpleCustomerLogger");
        simpleCustomerLogger.log();

        FileCustomerLogger fileCustomerLogger = (FileCustomerLogger) context.getBean("fileCustomerLogger");
        fileCustomerLogger.log();

        MemoryCustomerRepository memoryCustomerRepository = (MemoryCustomerRepository) context.getBean("memoryCustomerRepository");
        memoryCustomerRepository.addCustomer(simpleCustomerLogger);
    }
}
