package br.crafting.com;

import java.util.Calendar;

public class Invoice {
	
	private String commercialName;
	private String code;
	private Calendar date;
	
	
	public Invoice(String commercialName, String code, Calendar date) {
		this.commercialName = commercialName;
		this.code = code;
		this.date = date;
	}
	
	public String getCommercialName() {
		return commercialName;
	}
	
	public String getCode() {
		return code;
	}
	
	public Calendar getDate() {
		return date;
	}
	

}
