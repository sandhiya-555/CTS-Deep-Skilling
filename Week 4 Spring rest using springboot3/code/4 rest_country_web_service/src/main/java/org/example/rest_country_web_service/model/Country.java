package org.example.rest_country_web_service.model;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Country {
    private String name;
    private String code;

    public Country() {}

    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
