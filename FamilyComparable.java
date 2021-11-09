package com.technoelevate.collectionassignment;

import java.util.ArrayList;
import java.util.Collections;

public class FamilyComparable {

	public static void main(String[] args) {
     ArrayList <Family>list=new ArrayList<Family>();
     
     list.add(new Family(36,"Mother","Rajashri"));
     list.add(new Family(19,"Brother","Sid"));
     list.add(new Family(23,"Sister","Bhagyashri"));
     list.add(new Family(47,"Father","Dattatray"));
     list.add(new Family(21,"Me","Monali"));
     System.out.println(list);
     Collections.sort(list);//comparable
     System.out.println(list);
     FamilyComparator familyComparator=new FamilyComparator();//Comparator
     Collections.sort(list,familyComparator);
     System.out.println(list);
	}

}
