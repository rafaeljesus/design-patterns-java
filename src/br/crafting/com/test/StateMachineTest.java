package br.crafting.com.test;

import br.crafting.com.Budget;

public class StateMachineTest {
	
	public static void main(String[] args) {
		Budget budget = new Budget(500);
		
		budget.applyExtraDiscount();
		System.out.println(budget.getValue());
		
		budget.approve();
		
		budget.applyExtraDiscount();
		System.out.println(budget.getValue());
		
		budget.finish();
		
		budget.applyExtraDiscount();
		System.out.println(budget.getValue());
	} 

}
