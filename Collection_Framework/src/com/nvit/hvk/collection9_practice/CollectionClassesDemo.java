package com.nvit.hvk.collection9_practice;
//CollectionClassesDemo.java
import java.util.Collection;
import java.util.ArrayList;
import java.util.Vector;
import java.util.LinkedList;
import java.util.Stack;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionClassesDemo{

	public static void main(String[] args) {
		//List objects creation
		ArrayList	al	= new ArrayList();
		Vector		v 	= new Vector();
		LinkedList	ll	= new LinkedList();
		Stack		s	= new Stack();
		
		//Set objects creation
		HashSet			hs	= new HashSet();
		LinkedHashSet	lhs	= new LinkedHashSet();
		TreeSet			ts	= new TreeSet();

		addingElements(ts);
	}

	static void addingElements(Collection col){		
		//printing initial size of collection objects
		String name = col.getClass().getName();
		System.out.println(name+ " initial size: "+col.size()); 
		System.out.println();

		//adding elements to al
		System.out.println("is 20 added: "+	col.add( Integer.toString(20) ));
		System.out.println("is a added: "+	col.add( new Character('a') )	);
		System.out.println("is b added: "+	col.add( new Character('b') ));
		System.out.println("is abc added: "+	col.add( "abc"  ) );
		System.out.println("is Abc added: "+col.add( "Abc" ) );
		System.out.println("is abc added: "+	col.add( "abc" ) );
		System.out.println("is abc added: "+	col.add( new String("abc") )	);
		System.out.println("is Example added: "+col.add( new Example() ));
		System.out.println("is Example added: "+col.add( new Example() ));

		//adding nulls to collection
		System.out.println("is null added: "+col.add(null));
		System.out.println("is null added: "+col.add(null));
		System.out.println();

		//printing col modified size and elements
		System.out.println(name+ " modified size: "+col.size());
		System.out. println(name + " elements: " + col);
		System.out. println("==================");

	}
}
