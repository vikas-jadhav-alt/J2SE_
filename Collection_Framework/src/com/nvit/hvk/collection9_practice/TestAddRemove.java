package com.nvit.hvk.collection9_practice;
//TestAddRemove.java
import java.util.*;

//A.java
class A{
	int x = 10;
	int y = 20;
}

public class TestAddRemove{
	public static void main(String[] args){

		LinkedHashSet lhs = 
			new LinkedHashSet();

		lhs.add("a");	
		lhs.add("a");
		
		lhs.add(new A());
		lhs.add(new A());

		A a1 = new A();
		lhs.add(a1);
		lhs.add(a1);
		
		System.out.println("Original LHS");
		System.out.println("Size:  "+lhs.size());
		System.out.println("Elements:  "+lhs);

		System.out.println("\nAfter removing String object \"a\" ");

		lhs.remove("a");
		System.out.println("Size:  "+lhs.size());
		System.out.println("Elements:  "+lhs);

		System.out.println("\nAfter removing A class object using new A() ");

		lhs.remove( new A() );
		System.out.println("Size:  "+lhs.size());
		System.out.println("Elements:  "+lhs);

		System.out.println("\nAfter removing A class object using a1 ref var");

		lhs.remove( a1 );
		System.out.println("Size:  "+lhs.size());
		System.out.println("Elements:  "+lhs);

	}
}
