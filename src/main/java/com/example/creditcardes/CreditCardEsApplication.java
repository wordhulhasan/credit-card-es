package com.example.creditcardes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

@SpringBootApplication
public class CreditCardEsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CreditCardEsApplication.class, args);
        System.out.println("Program Started");

    }

}
