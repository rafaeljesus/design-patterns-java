package br.crafting.com;

public class InApproval implements BudgetState {
	
	public void applyExtraDiscount(Budget budget) {
		budget.value -= budget.value * 0.05;
	}

	@Override
	public void approve(Budget budget) {
		budget.currentState = new Approved();
	}

	@Override
	public void repprove(Budget budget) {
		budget.currentState = new Repproved();
	}

	@Override
	public void finish(Budget budget) {
		throw new RuntimeException("Budgets In Approval can not goes direct to Finished, it goes to Repproved instead...");
	}

}
