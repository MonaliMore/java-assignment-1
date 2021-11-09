package com.technoelevate.collectionassignment;

import java.util.ArrayList;
import java.util.Collections;

public class TrainerCollection {

	public static void main(String[] args) {
		ArrayList<Trainer> list=new ArrayList<Trainer>();
		list.add( new Trainer(105,"Megha","03yrs"));
		list.add( new Trainer(102,"Deepthi","10yrs"));
		list.add( new Trainer(103,"Nilim","03yrs"));
		list.add( new Trainer(101,"Azam","05yrs"));
		list.add( new Trainer(107,"Rakesh","07yrs"));
		list.add( new Trainer(108,"Bharath","15yrs"));
		//System.out.println(list);
		Collections.sort(list);//comparable
		System.out.println(list);
		TrainerComparator trainerComparator=new TrainerComparator();//Comparator
		Collections.sort(list,trainerComparator);
		System.out.println(list);
	





		
		


	}

}
