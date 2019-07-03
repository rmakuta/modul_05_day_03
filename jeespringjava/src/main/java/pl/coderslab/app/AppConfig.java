package pl.coderslab.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import pl.coderslab.beans.*;

@Configuration
public class AppConfig {

    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld("Wiadomość z adnotacji!");
    }

    @Bean
    public Captain jackSparrow() {
        return new Captain();
    }

    @Bean
    public Ship blackPearl() {
        return new Ship(jackSparrow());
    }

    @Bean
    @Scope("prototype")
    public ScopePrototype scopePrototype(){
        return new ScopePrototype();
    }

    @Bean
    public ScopeSingleton scopeSingleton(){
        return new ScopeSingleton();
    }
}
