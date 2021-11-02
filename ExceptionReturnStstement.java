package com.technoelevate.javabasics.exception.assignments;

public class ExceptionReturnStstement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(returnStatement());

	}
	public static String returnStatement() {
		try {
		System.out.println("hello");
		int result=10/0;
		System.out.println(result);
		return "hello";
	}
		catch(ArithmeticException e) {
			System.out.println("my name is megha sindhu");
			return "hi";
		}finally {
			System.out.println("im 34 years old");
			return "my son name is shourya";
		}

}
}
