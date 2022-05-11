package spring_introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration

public class myConfig {
    @Scope ("singleton")
    @Bean
    public Pet catBean () {
        return new Cat();
    }

    @Bean
    public Person personBean () {
        return new Person(catBean());
    }


}
