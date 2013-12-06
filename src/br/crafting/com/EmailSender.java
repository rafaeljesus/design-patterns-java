package br.crafting.com;

public class EmailSender implements ActionAfterGenerateInvoice {

	@Override
	public void execute(Invoice invoice) {
		System.out.println("Sending email...");
	}

}
