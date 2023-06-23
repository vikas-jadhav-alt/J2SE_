package com.nit.hk.cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test08_ListIterator {
	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<>();
		al.add("a");
		al.add(5);
		al.add("b");
		al.add(6);
		al.add("c");
		al.add(7);
		System.out.println(al);
		
		ListIterator<Object> litr = al.listIterator();
		int count = 1;
		while(litr.hasNext()) {
			Object obj = litr.next();
			if(obj instanceof String s) {
				litr.set(s.toUpperCase());
			} else if(obj instanceof Integer) {
				if(count == 1) {
					litr.add(20);
					count++;
				}
				
			}
		}
		
		System.out.println(al);
		
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
	}
}
