package com.technoelevate.javabasics.exception.assignments;

public class StringIndexOutOfBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=" monali ";
		char ch= str.charAt(1);
		char ch1=str.charAt(10);
		char ch2=str.charAt(-1);
		System.out.println(ch);
		System.out.println(ch1);
		System.out.println(ch2);
		

	}

}
