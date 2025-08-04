package com.cognizant.jpa_query_methods;

import com.cognizant.jpa_query_methods.model.Country;
import com.cognizant.jpa_query_methods.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class JpaQueryMethodsApplication implements CommandLineRunner {
@Autowired
public CountryRepository countryRepository;
    public static void main(String[] args) {
        SpringApplication.run(JpaQueryMethodsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception{
        System.out.println("Countries containing N");
        List<Country> result= countryRepository.findByConameContainingOrderByConameAsc("N");
        result.forEach(c-> System.out.println(c.getCo_code()+" "+c.getCo_name()));
        List<Country> result2=countryRepository.findByConameContaining("N");
        result2.forEach(c-> System.out.println(c.getCo_code()+" "+c.getCo_name()));
    }


}
