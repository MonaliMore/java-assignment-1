package com.technoelevate.collectionassignment;

import java.util.Comparator;

public class TrainerComparator implements Comparator<Trainer>{

	@Override
	public int compare(Trainer o1, Trainer o2) {
		
		return o2.exp.compareTo(o1.exp);
	}

}
