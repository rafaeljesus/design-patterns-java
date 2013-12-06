package br.crafting.com;

public class Finished implements BudgetState {

	@Override
	public void applyExtraDiscount(Budget budget) {
		throw new RuntimeException("Finished budgets can not receive extra discounts...");
	}

	@Override
	public void approve(Budget budget) {
		throw new RuntimeException("Budget already finished!");
	}

	@Override
	public void repprove(Budget budget) {
		throw new RuntimeException("Budget already finished!");
	}

	@Override
	public void finish(Budget budget) {
		throw new RuntimeException("Budget already finished!");
	}

}
