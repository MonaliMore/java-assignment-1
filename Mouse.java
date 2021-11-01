package com.technoelevate.javabasics.hasacomposition.assignment;

public class Mouse {
	String colour;
	int price;
	public Mouse(String colour, int price) {
		super();
		this.colour = colour;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Mouse [colour=" + colour + ", price=" + price + "]";
	}
	

}
