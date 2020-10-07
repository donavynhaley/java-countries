package com.lambdastudents.javacountries.repositories;

import com.lambdastudents.javacountries.models.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, Long>
{

}
