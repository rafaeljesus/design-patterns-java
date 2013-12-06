package br.crafting.com;

public class InvoicerDao implements ActionAfterGenerateInvoice {

	@Override
	public void execute(Invoice invoice) {
		System.out.println("Saving a invoice in database...");
	}

}
