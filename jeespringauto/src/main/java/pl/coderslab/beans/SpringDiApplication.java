package pl.coderslab.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.app.AppConfig;

public class SpringDiApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        PersonService person = context.getBean(PersonService.class);
        System.out.println(person.getPersonRepo().getClass().getName());
    }
}
