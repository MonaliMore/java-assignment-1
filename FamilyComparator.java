package com.technoelevate.collectionassignment;

import java.util.Comparator;

public class FamilyComparator implements Comparator<Family> {

	@Override
	public int compare(Family o1, Family o2) {
		// TODO Auto-generated method stub
		return o2.age-o1.age;
	}
	

}
