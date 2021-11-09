package com.technoelevate.collectionassignment;

import java.util.Comparator;

public class FriendsComparator implements Comparator<FriendshipCheck>{

	@Override
	public int compare(FriendshipCheck o1, FriendshipCheck o2) {
		// TODO Auto-generated method stub
		return o2.relation.compareTo(o1.relation);
	}
	

}
