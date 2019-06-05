package com.paka.factory;

public class PizzaFactory {

	public static Pizza createPizza(String type) {
		Pizza p = null;

		if (type.equals("cheesse")) {
			p = new CheesePizza();
		} else if (type.equals("veg")) {
			p = new VegPizza();
		} else if (type.equals("chicken")) {
			p = new ChickenPizza();
		} else {
			System.out.println("We don't have such pizza :(");
		}
		
		return p;
	}
}
