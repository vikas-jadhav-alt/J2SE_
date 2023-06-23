package com.nit.hk.cursors;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

//Create a collection of Strings with different length
//Remove the string whose length is >4 from this collection

public class Test03_Iterator {
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>(); 
		al.add("a");
		al.add("b");
		al.add("c");
		
		System.out.println(al);
		
		Iterator<String> itr1 = al.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next().toUpperCase());
		}
		
		System.out.println(al);	
		System.out.println();	
		
		//create HashSet object with integers
		//retrieve them and display on console by using Iterator
			
		HashSet<Integer> hs = new HashSet<>();
		hs.add(5);
		hs.add(6);
		hs.add(7);
		
		System.out.println(hs);
		Iterator<Integer> itr2 = hs.iterator();
		while (itr2.hasNext()) {
			Integer integer = itr2.next();
			System.out.println(integer);
		}
		
	}
}
