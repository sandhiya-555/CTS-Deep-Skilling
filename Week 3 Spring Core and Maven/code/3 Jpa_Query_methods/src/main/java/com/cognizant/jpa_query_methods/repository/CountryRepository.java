package com.cognizant.jpa_query_methods.repository;
import com.cognizant.jpa_query_methods.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface CountryRepository extends JpaRepository<Country,String>{

    List<Country> findByConameContaining(String name);

    List<Country> findByConameContainingOrderByConameAsc(String name);

}
