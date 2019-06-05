package com.paka.factory;

public class VegPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing veg pizza");
	}

	@Override
	public void bake() {
		System.out.println("Baking veg pizza");
	}

	@Override
	public void cut() {
		System.out.println("Cutting veg pizza");
	}

}
