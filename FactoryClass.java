package com.technoelevate.javabasics.abstraction;

public class FactoryClass {
	Colleagues colleagues=null;
	public  Colleagues getColleagues(String name) {
		if(name.equalsIgnoreCase("Dhananjay")) {
			colleagues=new Dhananjay();
		}else if(name.equalsIgnoreCase("Nitish")) {
			colleagues=new Nitish();
		}else {
			colleagues=new Vijay();
		}
		return colleagues;
	}

}
