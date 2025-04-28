package io.github.vibondarenko.foodorder.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Year;

@Configuration
public class Utilities {

    @Bean(name = "getCurrentYear")
    public String getCurrentYear() {
        return Year.now().toString();
    }

}
