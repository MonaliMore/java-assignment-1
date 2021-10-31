package com.technoelevate.javabasics.assignments;

public class ForStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int sum=0;
		for(int i=1;i<1000;i++) {
			if(i%3==0&&i%5==0) {
				count++;
				System.out.println("first digit is " +i);
				sum=sum+i;
			}
			if(count==5) {
				System.out.println("sum of first five digit is "+sum);
				break;
			}
		}

	}

}
