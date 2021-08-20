package com.tcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.tcc.controller"})
@EntityScan("com.delivery.domain")
@EnableJpaRepositories("com.delivery.repository")
public class TccApiApplication

{
    public static void main(String[] args) {
        SpringApplication.run(TccApiApplication.class, args);
    }
}
