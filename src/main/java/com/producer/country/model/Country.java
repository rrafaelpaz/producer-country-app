package com.producer.country.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Country {

    @NotBlank
    private String name;

    @NotBlank
    private String continent;

    @NotNull
    private Integer population;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }
}
