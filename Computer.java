package com.technoelevate.javabasics.hasacomposition.assignment;

public class Computer {
	String name;
	String type;
	MotherBoard motherboard;
	Mouse mouse;
	Cpu cpu;
	Monitor monitor;
	public Computer(String name, String type, MotherBoard motherboard, Mouse mouse, Cpu cpu, Monitor monitor) {
	
		this.name = name;
		this.type = type;
		this.motherboard = motherboard;
		this.mouse = mouse;
		this.cpu = cpu;
		this.monitor = monitor;
	}
	public void status() {
		System.out.println(this.name+" "+this.type+" "+this.motherboard+" "+this.mouse+" "+this.cpu+" "+this.monitor);
		System.out.println("computer is ready to use");
	}
	

}
