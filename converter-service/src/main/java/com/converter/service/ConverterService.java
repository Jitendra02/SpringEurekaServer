package com.converter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.converter.model.CurrencyConversion;

@Service
public class ConverterService {

	@Autowired
	private CurrencyExchangeServiceProxy proxy;
	
	public CurrencyConversion getValue(String from,String to,int amount) {
		
		CurrencyConversion l_currencyConversion = proxy.getValue(from, to);
		
		l_currencyConversion.setFromAmount(amount);
		l_currencyConversion.setToAmount(amount*l_currencyConversion.getValue());
		
		return l_currencyConversion;
	}
}
