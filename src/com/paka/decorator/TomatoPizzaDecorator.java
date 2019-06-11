package com.paka.decorator;

public class TomatoPizzaDecorator extends PizzaDecorator {

	public TomatoPizzaDecorator(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public void bake() {
		super.bake();
		System.out.println("Adding tomato");
	}

}
