package com.example.country;

import com.example.country.model.Country;
import com.example.country.repository.Countryrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CountryApplication implements CommandLineRunner {

	@Autowired
	private Countryrepository repository;

	public static void main(String[] args) {
		SpringApplication.run(CountryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Country country = new Country("FR", "France");
		repository.save(country);
		System.out.println("New country added: " + country.getName());
	}


}
