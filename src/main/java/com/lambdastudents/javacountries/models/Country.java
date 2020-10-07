package com.lambdastudents.javacountries.models;

import javax.persistence.*;

@Entity

@Table(name = "countries")
public class Country
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long contryid;

    String countryname;
    long population;
    long landmasskm2;
    int medianage;

    public Country()
    {
    }
    public Country(long id, String name, long population, long landmasskm2, int medianage)
    {
        countryname =name;
        contryid = id;
        this.population = population;
        this.landmasskm2 = landmasskm2;
        this.medianage = medianage;
    }

    @Override
    public String toString() {
        return "Country{" +
                "contryid=" + contryid +
                ", countryname='" + countryname + '\'' +
                ", population=" + population +
                ", landmasskm2=" + landmasskm2 +
                ", medianage=" + medianage +
                '}';
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public long getLandmasskm2() {
        return landmasskm2;
    }

    public void setLandmasskm2(long landmasskm2) {
        this.landmasskm2 = landmasskm2;
    }

    public int getMedianage() {
        return medianage;
    }

    public void setMedianage(int medianage) {
        this.medianage = medianage;
    }
}
