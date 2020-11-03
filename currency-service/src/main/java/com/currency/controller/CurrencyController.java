package com.currency.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.currency.entity.Currency;
import com.currency.service.CurrencyService;

@RestController
public class CurrencyController {
	
	@Autowired
	private CurrencyService currencyService;

	@GetMapping("/currency-exchange/{from}/{to}")
	public Currency getCurrencyValue(
			@PathVariable String from, @PathVariable String to
	){
		
		Currency l_currency = currencyService.getCurrency(from, to);
		
		return l_currency;
	}
}
