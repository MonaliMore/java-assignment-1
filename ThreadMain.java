package com.technoelevate.multithreading.nov11assignments;


public class ThreadMain {
	public static void main(String[] args) {
		Freshlite03B freshlite03b=new Freshlite03B();
		freshlite03b.setPriority(7);
		freshlite03b.start();
		
		Freshlite03f freshlite03f=new Freshlite03f();
		Thread thread=new Thread(freshlite03f);
		thread.setPriority(2);
		thread.start();
		
		System.out.println(freshlite03b.getName());
		System.out.println(freshlite03b.getPriority());
		
		System.out.println(thread.getName());
		System.out.println( thread.getPriority());
	}
}
