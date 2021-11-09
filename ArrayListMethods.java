package com.technoelevate.collectionassignment;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList list2=new ArrayList();
		list2.add(70);
		list2.add(90);

		ArrayList list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add("hii");
		list.add('a');
		list.add(20);
		list.add(50);
		list.add(20.5f);
		System.out.println(list);
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println(list.get(1));
		System.out.println(list.set(5, "hello"));
		System.out.println(list);
		System.out.println(list.indexOf("hii"));
		System.out.println(list.lastIndexOf(20.5f));
		System.out.println(list.lastIndexOf(3));
		System.out.println(list.addAll(list2));
		System.out.println(list);
		System.out.println(list.contains(1));
		System.out.println(list.remove(6));
		System.out.println(list);
		
		
		

	}

}
