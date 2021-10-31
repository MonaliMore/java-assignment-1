package com.technoelevate.javabasics.assignments;

public class ClassMethodOverload {
	public static double area(double radius) {
		if (radius >= 0) {
			System.out.println("area of circle");
			return 3.14 * radius * radius;
		} else {
			System.out.println("invalid");
			return -1.0;

		}

	}

	public static double area(double x, double y) {
		if (x >= 0 && y >= 0) {
			System.out.println("area of rectangel");
			return x * y;
		} else {
			System.out.println("invalid");
			return -1.0;
		}

	}

	public static void main(String[] args) {

		System.out.println(area(10.2));
		System.out.println(area(-1, 3.78));
	}
}
