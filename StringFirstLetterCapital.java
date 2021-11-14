package com.technoelevate.javabasics.assignments;

public class StringFirstLetterCapital {
	
		public static void main(String[] args) {
			String s="monali dattatray more";
			char[] c=s.toCharArray();
			for(int i=0;i<c.length;i++) {
				if(i==0)
					c[i]=(char)((int)c[i]-32);
				else if(c[i]==' ')
					c[i+1]=(char)((int)c[i+1]-32);
			}
			String str=new String(c);
			System.out.println(str);
		}
	}


