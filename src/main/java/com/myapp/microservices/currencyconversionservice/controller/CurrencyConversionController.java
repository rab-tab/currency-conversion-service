package com.myapp.microservices.currencyconversionservice.controller;

import com.myapp.microservices.currencyconversionservice.CurrencyConversionBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyConversionController {

    @GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversionBean convertCurency(@PathVariable String from, @PathVariable String to,
                                                 @PathVariable BigDecimal quantity){
        return new CurrencyConversionBean( 1l,from,to,BigDecimal.ONE,quantity,quantity,0);

    }
}
