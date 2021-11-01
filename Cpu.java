package com.technoelevate.javabasics.hasacomposition.assignment;

public class Cpu {
	String dateOfMan;
	double price;
	public Cpu(String dateOfMan, double price) {
		super();
		this.dateOfMan = dateOfMan;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Cpu [dateOfMan=" + dateOfMan + ", price=" + price + "]";
	}
	
	

}
