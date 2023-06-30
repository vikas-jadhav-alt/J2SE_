package com.nvit.hvk.collection9_practice;
import java.util.*;
class  IteratorDemo{
	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("a");
		lhs.add(5);
		lhs.add("b");
		lhs.add(6);
		System.out.println(lhs);

		Iterator lhsItr = lhs.iterator();
		while ( lhsItr.hasNext() ){
			Object obj = lhsItr.next();
			if (obj instanceof String){
			
				String s = (String)obj;
				System.out.println(s.toUpperCase());
			}
			else{
				System.out.println(obj);
			}
		}
		System.out.println(lhs);
	
		System.out.println();
		ArrayList al = new ArrayList();
		al.add("e");
		al.add(5);
		al.add("f");
		al.add(6);
		System.out.println(al);
		

		lhsItr = al.iterator();
		while ( lhsItr.hasNext() ){
			Object obj = lhsItr.next();
			if (obj instanceof String){
			
				String s = (String)obj;
				System.out.println(s.toUpperCase());
			}
			else{
				System.out.println(obj);
			}
		}
		System.out.println(lhs);

	}
}
