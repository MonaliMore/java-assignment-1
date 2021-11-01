package com.technoelevate.javabasics.hasacomposition.assignment;

public class MainMethodHasA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MotherBoard motherBoard=new MotherBoard(2000.50, "123abc");
      Cpu cpu=new Cpu("june 21", 5000.9);
      Monitor monitor=new Monitor("14*12", 123);
      Mouse mouse=new Mouse("black", 500);
      Computer computer=new Computer("lenovo", "laptop", motherBoard, mouse, cpu, monitor);
      computer.status();
      
	}

}
