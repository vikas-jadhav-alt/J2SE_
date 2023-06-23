package com.nit.hk.suncollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class Test09_RemovingDuplicatesInAL_App2{
	public static void main(String[] args) {
		
		ArrayList<String> al1 = new ArrayList<>();
		populate(al1);		
		
		System.out.println("Before remove al: "+ al1); 
		removeDuplicate(al1);
		System.out.println("After  remove al: "+ al1); 
	
	}
	private static void populate(ArrayList<String> al1) {
		al1.add("a");
		al1.add("b");
		al1.add("a");
		al1.add("c");
		al1.add("a");
		al1.add("e");
		al1.add(null);
		al1.add("b");
		al1.add(null);
		al1.add("a");
		al1.add(null);
		al1.add("a");
	}
	private static void removeDuplicate(ArrayList<String> al) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>(al);
		al.clear();
		al.addAll(lhs);
	}
}