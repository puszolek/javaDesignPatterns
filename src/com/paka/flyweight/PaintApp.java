package com.paka.flyweight;

public class PaintApp {

	public void render(int numOfShapes) {
		
		Shape shape = null;
		for (int i=1; i < numOfShapes; i++) {
			if(i%2 == 0) {
				shape = ShapeFactory.getShape("circle");
				shape.draw(i, "red", "blue");
			} else {
				shape = ShapeFactory.getShape("rectangle");
				shape.draw(i, i+i, "dotted");
			}
		}
	}
	
}
