package com.currency.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.currency.entity.Currency;
import com.currency.repo.CurrencyRepo;

@Service
public class CurrencyService {

	@Autowired
	private CurrencyRepo currencyRepo;
	
	public Currency getCurrency(String p_from,String p_to) {
		
		Currency l_currency = currencyRepo.findByFromAndTo(p_from, p_to);
		
		return l_currency;
	}
}
