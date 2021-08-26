package com.tcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"com.tcc.controller.PacienteController"})
@EntityScan("com.tcc.domain.Paciente")
@EnableJpaRepositories("com.tcc.repository.PacienteRepository")
public class TccApiApplication

{
    public static void main(String[] args) {

        SpringApplication.run(TccApiApplication.class);
    }
}
