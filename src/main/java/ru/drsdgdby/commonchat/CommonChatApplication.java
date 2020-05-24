package ru.drsdgdby.commonchat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:db.properties")
public class CommonChatApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonChatApplication.class, args);
    }

}
