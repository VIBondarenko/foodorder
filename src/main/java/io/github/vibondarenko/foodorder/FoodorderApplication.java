package io.github.vibondarenko.foodorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class FoodorderApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoodorderApplication.class, args);
    }

}
