package com.nvit.hvk.collection9_practice;
//TestAddRemove2.java
import java.util.*; 
class TestAddRemove2{
	public static void main(String[] args){
		LinkedHashSet lhs = 
			new LinkedHashSet();
	
		lhs.add( new A(2, 3) );	
		lhs.add( new A(3, 4) );	
		lhs.add( new A(2, 3) );	
		lhs.add( new A(3, 2) );	
	
		System.out.println("Original LHS");
		System.out.println("\t"+lhs);
		
		lhs.remove( new A(2, 3) );
		System.out.println("\nElements after remove method call");
		System.out.println("\t"+lhs);
	}
}