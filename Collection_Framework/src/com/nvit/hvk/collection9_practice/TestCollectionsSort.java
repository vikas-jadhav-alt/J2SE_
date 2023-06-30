package com.nvit.hvk.collection9_practice;
import java.util.*;

class  TestCollectionsSort{
	public static void main(String[] args) {
		ArrayList<String> al  = 
					new ArrayList<String>();
		al.add("a");
		al.add("c");
		al.add("b");

		System.out.println("AL before sorting");
		System.out.println(al);
		System.out.println();

		Collections.sort(al);

		System.out.println("AL after Nat Sorting Order");
		System.out.println(al);
 
		System.out.println();

		Collections.sort(
						al, 
						new StringComparator() 
		);

		System.out.println("AL after Cus Sorting Order");
		System.out.println(al);  
	}
}
