package com.tnsif.dayone.looping;

public class Nestedifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=8,c=12;
		if(a>b) {
			if(a>c)
				System.out.println(a + " is the largest number");
			else
				System.out.println(c + " is the largest number");
		}
		else {
			if(b>c)
				System.out.println(b + " is the largest number");
			else
				System.out.println(c + " is the largest number");
		}

	}

}
