package br.crafting.com;

public class Budget {
	
	protected double value;
	protected BudgetState currentState;
	
	public Budget(double value) {
		this.value = value;
		this.currentState = new InApproval();
	}
	
	public void applyExtraDiscount() {
		currentState.applyExtraDiscount(this);
	}
	
	public void approve() {
		currentState.approve(this);
	}
	
	public void reprove() {
		currentState.repprove(this);
	}
	
	public void finish() {
		currentState.finish(this);
	}

	public double getValue() {
		return value;
	}

}
