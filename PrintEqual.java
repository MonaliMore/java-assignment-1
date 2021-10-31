package com.technoelevate.javabasics.assignments;

public class PrintEqual {
	public static void printEqual(int a,int b,int c) {
		if(a==0&&b==0&&c==0) {
			System.out.println("invalid values");
		}
		else if(a==b&&a==c&&b==c) {
			System.out.println("all numbers are equal");
		}
		else if(a!=b||a!=c||b!=c) {
			System.out.println("all numbers are different");
		}
		else {
			System.out.println("neigther all are equal nor different");
		}
	}
	public static void main(String []args) {
		printEqual(10,20,30);
		printEqual(0,0,0);
		printEqual(10,10,10);
	}

}
