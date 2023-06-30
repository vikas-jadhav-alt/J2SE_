package com.nvit.hvk.practice_collection.com.nit.hk.cursors;

import java.util.Iterator;
import java.util.LinkedHashSet;

//Create a collection of Strings, Integers and some other types 
//Remove all integers from this collection and display all strings 
//in upper case by using Iterator


public class Test06_IteratorRemove2 {
	public static void main(String[] args) {
		
		LinkedHashSet<Object> lhs = new LinkedHashSet<>();
		lhs.add("a");
		lhs.add(5);
		lhs.add("b");
		lhs.add(6);
		lhs.add("c");
		lhs.add(7);
		lhs.add(null);
		lhs.add(true);
		lhs.add('p');
		
		System.out.println(lhs);
		
		Iterator<Object> itr = lhs.iterator();
		//itr.remove();	//RE: ISE	
		while(itr.hasNext()) {
			//itr.remove();	//RE: ISE
			Object obj = itr.next();
			//itr.remove(); //No RE, but all elements are removed
			if(obj == null) {
				//itr.remove();	//No RE, only null elements are removed
			}
		}	
		itr.remove(); //allowed, here the last element is removed
		System.out.println(lhs);	
		
	}
}
