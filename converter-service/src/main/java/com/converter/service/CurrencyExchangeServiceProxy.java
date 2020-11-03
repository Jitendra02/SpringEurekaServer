package com.converter.service;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.converter.model.CurrencyConversion;

@FeignClient(name="currency-service")
@RibbonClient(name="currency-service")
public interface CurrencyExchangeServiceProxy {

	@GetMapping("/currency-exchange/{from}/{to}")
	public CurrencyConversion getValue(
			@PathVariable("from") String from,
			@PathVariable("to") String to
	);
}
