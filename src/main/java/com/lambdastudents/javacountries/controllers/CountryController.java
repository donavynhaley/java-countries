package com.lambdastudents.javacountries.controllers;

import com.lambdastudents.javacountries.models.Country;
import com.lambdastudents.javacountries.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CountryController
{
    @Autowired
    private CountryRepository countryRepo;

    @GetMapping(value = "/countries/all", produces = {"application/json"})
    public ResponseEntity<?>findAllCountries()
    {
        List<Country> allCountries = new ArrayList<>();

        countryRepo.findAll().iterator().forEachRemaining(allCountries::add);
        allCountries.sort((c1, c2) -> c1.getCountryname().compareToIgnoreCase(c2.getCountryname()));
        System.out.println(allCountries);

        allCountries.forEach(country -> System.out.println(country));
        return new ResponseEntity<>(allCountries, HttpStatus.OK);
    }
}

