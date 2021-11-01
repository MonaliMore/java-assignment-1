package com.technoelevate.javabasics.hasacomposition.assignment;

public class Monitor {
	String size;
	int srNO;
	public Monitor(String size, int srNO) {
		super();
		this.size = size;
		this.srNO = srNO;
	}
	@Override
	public String toString() {
		return "Monitor [size=" + size + ", srNO=" + srNO + "]";
	}
	
	

}
