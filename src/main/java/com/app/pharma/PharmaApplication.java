package com.app.pharma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PharmaApplication {

    public static void main(String[] args) {

        System.out.println("Hello world and docker!");
        SpringApplication.run(PharmaApplication.class, args);
    }

}
