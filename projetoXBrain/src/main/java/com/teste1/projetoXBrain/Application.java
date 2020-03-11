package com.teste1.projetoXBrain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = { "com.teste1.projetoXBrain.entity" })
@EnableJpaRepositories(basePackages = { "com.teste1.projetoXBrain.repository" })
@ComponentScan(basePackages = { "com.teste1.projetoXBrain.controller" })

public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
  }
}
