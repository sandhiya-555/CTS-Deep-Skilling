package org.example.springrest_helloworld.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    public static final Logger logger= LoggerFactory.getLogger(HelloController.class);
    @GetMapping("/hello")
    public String hello(){
        logger.info("Started hello()");
        String message="Hello World!";
        logger.info("Ended hello()");
        return message;
    }
}
