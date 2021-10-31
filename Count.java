package com.technoelevate.javabasics.assignments;
import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int e=0;
		int o=0;
		int p=0;
		int n=0;
		int z=0;
		System.out.println("enter 20 integers: ");
		for(int i=1;i<=20;i++)
		{
			int m =sc.nextInt();
			if(m%2==0)
			{
				e++;
			}
			else{
				o++;
			}
			if(m>0){
				p++;
			}
			else{
				n++;
			}
			if(m==0){
				z++;
			}
	}
	System.out.println(e);
	System.out.println(o);
	System.out.println(p);
	System.out.println(n);
	System.out.println(z);



	}

}
