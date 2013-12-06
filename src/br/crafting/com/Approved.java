package br.crafting.com;

public class Approved implements BudgetState {
	
	public void applyExtraDiscount(Budget budget) {
		budget.value -= budget.value * 0.02;
	}

	@Override
	public void approve(Budget budget) {
		throw new RuntimeException("Budget can not goes to approved, its already approved...");
		
	}

	@Override
	public void repprove(Budget budget) {
		throw new RuntimeException("Budget can not goes to repproved, its already approved...");
	}

	@Override
	public void finish(Budget budget) {
		budget.currentState = new Finished();
	}

}
