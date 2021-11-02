package com.technoelevate.javabasics.exception.assignments;

public class Voting {
	int age;

	public Voting(int age) {
		
		this.age = age;
	}
	public void voteAge(int ageForVote) throws Noteligible {
		if(ageForVote<=age) {
			System.out.println("eligible for voting");
		}
		else {
			throw new Noteligible("You are not eligile for voting");
		}
	}
	

}
