package com.nvit.hvk.practice_collection.com.nit.hk.cursors;

import java.util.Enumeration;
import java.util.Vector;

//Create a collection of Strings with different length
//Remove the string whose length is >4 from this collection

public class Test02_Enumeration2 {
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		v.add("a");
		v.add("abc");
		v.add("abcd");
		v.add("abcde");
		v.add("abcdef");
		v.add("abcdefg");
		System.out.println(v);
		
		Enumeration<String> e = v.elements(); 
		while(e.hasMoreElements()) {
			String s = e.nextElement();
			if(s.length() > 4) {
				v.remove(s);
			}
		}
		
		System.out.println(v);
			
			
		
	}
}
