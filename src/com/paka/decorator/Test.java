package com.paka.decorator;

public class Test {

	public static void main(String[] args) {

		Pizza pizza = new TomatoPizzaDecorator(new CheesePizzaDecorator(new PlainPizza()));
		pizza.bake();
		
	}

}
