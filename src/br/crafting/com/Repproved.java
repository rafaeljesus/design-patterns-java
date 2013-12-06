package br.crafting.com;

public class Repproved implements BudgetState {

	@Override
	public void applyExtraDiscount(Budget budget) {
		throw new RuntimeException("Repproved budgets can not receive extra discounts...");
	}

	@Override
	public void approve(Budget budget) {
		throw new RuntimeException("Reppoved budgets can not goes to approved...");
		
	}

	@Override
	public void repprove(Budget budget) {
		throw new RuntimeException("Reppoved budgets can not goes to repproved, its already repproved...");
	}

	@Override
	public void finish(Budget budget) {
		budget.currentState = new Finished();
	}

}
