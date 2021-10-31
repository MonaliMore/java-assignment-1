package com.technoelevate.javabasics.assignments;
import java.util.Scanner;

public class PrintNumberInWordMainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("please enter number");
		int num=s.nextInt();
		PrintNumberInword.printNumberInWord(num);

	}

}
