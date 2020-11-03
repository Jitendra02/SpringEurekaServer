package com.converter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.converter.model.CurrencyConversion;
import com.converter.service.ConverterService;

@RestController
public class ConverterController {

	@Autowired
	private ConverterService converterService;
	
	@GetMapping("/currencyConverterFeign/{from}/{to}/{amount}")
	public CurrencyConversion convertValue(
			@PathVariable String from, @PathVariable String to,
		      @PathVariable int amount
			) {
		
		CurrencyConversion l_response = converterService.getValue(from, to, amount);
		return l_response;
	}
}
