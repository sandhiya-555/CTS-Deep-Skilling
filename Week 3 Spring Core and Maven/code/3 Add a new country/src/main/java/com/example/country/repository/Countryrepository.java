package com.example.country.repository;

import com.example.country.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Countryrepository extends JpaRepository<Country, String> {
}
