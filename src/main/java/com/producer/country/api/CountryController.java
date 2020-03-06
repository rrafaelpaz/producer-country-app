package com.producer.country.api;

import com.producer.country.model.Country;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("api/v1/country")
public class CountryController {

    @PostMapping("send")
    public String sendCountryInfo(@NotNull @Valid @RequestBody Country country){

        return "hello";
    }
}
