package br.crafting.com;

public interface BudgetState {
	
	void applyExtraDiscount(Budget budget);
	
	void approve(Budget budget);
	
	void repprove(Budget budget);
	
	void finish(Budget budget);

}
