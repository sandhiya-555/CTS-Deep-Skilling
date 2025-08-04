package org.example.get_country_based_on_code.controller;

import org.example.get_country_based_on_code.model.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @GetMapping("/country/{code}")
    public Country getcountry(@PathVariable String code){
    return Country.getCountry(code);
        }

}
