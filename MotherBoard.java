package com.technoelevate.javabasics.hasacomposition.assignment;

public class MotherBoard {
	double price;
	String srNo;
	public MotherBoard(double price, String srNo) {
		super();
		this.price = price;
		this.srNo = srNo;
	}
	@Override
	public String toString() {
		return "MotherBoard [price=" + price + ", srNo=" + srNo + "]";
	}
	

}
