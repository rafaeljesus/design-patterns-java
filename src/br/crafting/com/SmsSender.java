package br.crafting.com;

public class SmsSender implements ActionAfterGenerateInvoice {

	@Override
	public void execute(Invoice invoice) {
		System.out.println("Sending a sms...");
	}

}
