package com.technoelevate.javabasics.exception.assignments;

public class Noteligible extends Exception {
	String msg;

	//public Noteligible(String msg) {
		
		//this.msg = msg;
	
	public Noteligible(String msg) {
		// TODO Auto-generated constructor stub
		this.msg= msg;
	}
	@Override
	public String getMessage() {
		return msg;
	}
	

}
