package com.technoelevate.javabasics.assignments;

public class ArrayAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {20,30,25,35,-16,60,-100};
		int len=a.length;
		double sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
		}
		double average=sum/len;
		System.out.println("average of array is "+average);

	}

}
