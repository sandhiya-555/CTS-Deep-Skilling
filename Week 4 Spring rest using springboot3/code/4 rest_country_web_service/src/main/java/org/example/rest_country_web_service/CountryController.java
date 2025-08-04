package org.example.rest_country_web_service;

import org.example.rest_country_web_service.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @GetMapping("/country")

    public Country getcountry(){
        ApplicationContext context= new ClassPathXmlApplicationContext("countrydefinition.xml");

        return   context.getBean("country",Country.class);

    }
}
