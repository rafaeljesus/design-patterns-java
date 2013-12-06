package br.crafting.com;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class InvoiceBuilder {
	
	private String commercialName;
	private String code;
	private Calendar date;
	
	private List<ActionAfterGenerateInvoice> actionAfterGenerateInvoices;
	
	public InvoiceBuilder() {
		this.actionAfterGenerateInvoices = new ArrayList<ActionAfterGenerateInvoice>();
	}
	
	public Invoice build() {
		Invoice invoice = new Invoice(this.commercialName, this.code, this.date);
		for (ActionAfterGenerateInvoice action : this.actionAfterGenerateInvoices) {
			action.execute(invoice);
		}
		return invoice;
	}
	
	public InvoiceBuilder withActions(List<ActionAfterGenerateInvoice> actions) {
		this.actionAfterGenerateInvoices.addAll(actions);
		return this;
	}
	
	public InvoiceBuilder forCompany(String commercialName) {
		this.commercialName = commercialName;
		return this;
	}
	
	public InvoiceBuilder withCode(String code) {
		this.code = code;
		return this;
	}
	
	public InvoiceBuilder fromNow() {
		this.date = Calendar.getInstance();
		return this;
	}

}
