package com.nit.hk.suncollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test07_StopingDuplicatesInAL{
	public static void main(String[] args) {
		
		ArrayList<String> al1 = new ArrayList<>();
		add("a", al1); 
		add("c", al1); 
		add("b", al1);
		add("a", al1);
		add("b", al1);
		
		System.out.println(al1); 
	

	}
	static void add(String s, ArrayList<String> al) {
		if(!al.contains(s)) //in this adding object class equals() method 
			al.add(s);			//must be overridden
	}
}