package com.technoelevate.collectionassignment;

public class FriendshipCheck implements Comparable<FriendshipCheck>{
	String name;
	String relation;
	int age;
	public FriendshipCheck(String name, String relation, int age) {
		super();
		this.name = name;
		this.relation = relation;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "FriendshipCheck [name=" + name + ", relation=" + relation + ", age=" + age + "]";
	}

	@Override
	public int compareTo(FriendshipCheck o) {
		

		return this.relation.compareTo(o.relation);
	}
	
	

}
