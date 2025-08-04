package org.example.ex1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;  
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ex1Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Ex1Application.class);

    public static void main(String[] args) {

        SpringApplication.run(Ex1Application.class, args);
        System.out.println("This is a simple web project created in maven");
        LOGGER.info("Inside main method");
    }

}
