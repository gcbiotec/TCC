package org.medicdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration

public class MedicDataApp {
    public static void main(String[] args) {
        SpringApplication.run(MedicDataApp.class);
    }
}
