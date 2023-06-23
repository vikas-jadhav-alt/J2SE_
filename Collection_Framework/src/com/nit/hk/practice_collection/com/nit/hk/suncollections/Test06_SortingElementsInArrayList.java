package com.nit.hk.suncollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test06_SortingElementsInArrayList{
	public static void main(String[] args) {
		
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("a"); 
		al1.add("c"); 
		al1.add("b");
		
		System.out.println(al1); 
		//Collections.sort(al1);  //before Java 8v
		al1.sort(null);			  //from Java 8v direct method	
		System.out.println(al1);
	

	}
}