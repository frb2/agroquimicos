package com.example.agroquimicos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.example.agroquimicos.domain.entities"})
public class AgroquimicosApplication {

    public static void main(String[] args) {
        SpringApplication.run(AgroquimicosApplication.class, args);
    }

}
