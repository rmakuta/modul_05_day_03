package pl.coderslab.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.beans.*;

public class SpringDiApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        System.out.println(helloWorld.getMessage());

        EmailService emailService = (EmailService) context.getBean("emailService");
        emailService.send();

        MessageSender messageSender = (MessageSender) context.getBean("messageSender");
        messageSender.sendMessage();

        MessageSender messageSender2 = (MessageSender) context.getBean("messageSender");
        messageSender2.sendMessageFromProperty();

        context.close();
    }
}
