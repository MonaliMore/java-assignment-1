package com.technoelevate.collectionassignment;

import java.util.ArrayList;
import java.util.Collections;

public class FriendsComparable {

	public static void main(String[] args) {
    ArrayList<FriendshipCheck>list=new ArrayList<FriendshipCheck>();
    list.add(new FriendshipCheck("Tina","Friend",27));
    list.add(new FriendshipCheck("Meena","Girlfriend",29));
    list.add(new FriendshipCheck("Jiya","Friend",26));
    list.add(new FriendshipCheck("Riya","Notriend",30));
    list.add(new FriendshipCheck("Veda","Notfriend",21));
    list.add(new FriendshipCheck("Tina","Justfriend",15));
    list.add(new FriendshipCheck("shiv","Bestfriend",5));
    Collections.sort(list);
    System.out.println(list);
    FriendsComparator friendsComparator=new FriendsComparator();
    Collections.sort(list,friendsComparator);
    System.out.println(list);
    
    
    
    
    
	}

}
