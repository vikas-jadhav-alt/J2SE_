package com.nvit.hvk.collection9_practice;
//ListIteratorDemo.java
import java.util.*;
class ListIteratorDemo {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("a");	
al.add(5);
al.add("b");	
al.add(6);
al.add("c"); 
al.add(7);
	
		
		System.out.println("AL elements before iteration: "+ al);
		int count = 1;

		ListIterator litr = al.listIterator();
		while (litr.hasNext()){
	
			Object obj = litr.next();
			System.out.println("Current Element: "+ obj);
		
			if (obj instanceof String){
				String s = (String)obj;
				litr.set(s.toUpperCase());
			}
			else if (obj instanceof Integer){
				if (count == 1){
					litr.add(20);
count++;				
}
			}//else if
		}//while

		System.out.println("AL elements after iteration: "+ al);

//retrieving elements in reverse order
while (litr.hasPrevious()){
	Object obj = litr.previous();
System.out.println(obj);
}
	}//main
}//class
