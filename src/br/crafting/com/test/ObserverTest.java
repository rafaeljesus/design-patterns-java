package br.crafting.com.test;

import java.util.Arrays;

import br.crafting.com.EmailSender;
import br.crafting.com.Invoice;
import br.crafting.com.InvoiceBuilder;
import br.crafting.com.InvoicerDao;
import br.crafting.com.SmsSender;

public class ObserverTest {
	
	public static void main(String[] args) {
		
		Invoice invoice = new InvoiceBuilder()
			.withActions(Arrays.asList(new EmailSender(), new InvoicerDao(), new SmsSender()))
			.forCompany("Crafting")
			.withCode("1234.5678.910")
			.fromNow()
			.build();
		
		System.out.println("Generated Invoice => " + invoice.getCommercialName());
	}

}
