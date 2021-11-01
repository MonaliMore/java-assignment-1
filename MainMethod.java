package com.technoelevate.javabasics.abstraction;
import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		FactoryClass factoryClass=new FactoryClass();
		System.out.println("Choose the colleauge");
		System.out.println("1.Dhananjay\n2.Nitish\n3.Vijay\n");
		System.out.println("please choose");
		int ch=sc.nextInt();
		Colleagues colleagues=null;
		switch(ch) {
		case 1:
			factoryClass.getColleagues("dhananjay").nature();
			break;
		case 2:
			factoryClass.getColleagues("nitish").nature();
			break;
		case 3:
			factoryClass.getColleagues("vijay").nature();
			break;
			default:
				System.out.println("invalid");
			
		}

	}

}
