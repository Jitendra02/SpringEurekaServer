package com.converter.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrencyConversion {

	private int id;
	
	private String from;
	
	private String to;
	
	private int value;
	
	private Date date;
	
	private int fromAmount;
	
	private int toAmount;
	
	//-------------------------------------------------------------------------

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * @param from the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}

	/**
	 * @return the to
	 */
	public String getTo() {
		return to;
	}

	/**
	 * @param to the to to set
	 */
	public void setTo(String to) {
		this.to = to;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the fromAmount
	 */
	public int getFromAmount() {
		return fromAmount;
	}

	/**
	 * @param fromAmount the fromAmount to set
	 */
	public void setFromAmount(int fromAmount) {
		this.fromAmount = fromAmount;
	}

	/**
	 * @return the toAmount
	 */
	public int getToAmount() {
		return toAmount;
	}

	/**
	 * @param toAmount the toAmount to set
	 */
	public void setToAmount(int toAmount) {
		this.toAmount = toAmount;
	}
}
