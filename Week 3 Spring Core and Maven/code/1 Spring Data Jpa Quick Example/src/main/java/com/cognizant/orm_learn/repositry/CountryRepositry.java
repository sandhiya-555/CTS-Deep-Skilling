package com.cognizant.orm_learn.repositry;

import com.cognizant.orm_learn.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepositry extends JpaRepository<Country,String> {
}
