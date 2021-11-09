package com.technoelevate.collectionassignment;

public class Family implements Comparable<Family>{
	int age;
	String realtion;
	String name;
	public Family(int age, String realtion, String name) {
		super();
		this.age = age;
		this.realtion = realtion;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Family [age=" + age + ", realtion=" + realtion + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Family o) {
		// TODO Auto-generated method stub
		return this.age-o.age;
	}
	

}
