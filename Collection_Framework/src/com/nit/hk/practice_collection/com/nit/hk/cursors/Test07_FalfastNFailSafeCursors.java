package com.nit.hk.cursors;

import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Vector;

public class Test07_FalfastNFailSafeCursors {
	public static void main(String[] args) {
		
		Vector<String> v1 = new Vector<>();
		v1.add("a");
		v1.add("b");
		v1.add("c");
		
		Enumeration<String> e = v1.elements(); //legacy implementation Enumeration  
		System.out.println(e.nextElement());   //is not fail fast, it is fail safe
		v1.add("d");
		System.out.println(e.nextElement());
		
		Enumeration<String> e2 = Collections.enumeration(v1); //CF implementation of Enumeration
		System.out.println(e2.nextElement());	//is fail fast, it internally uses 
		v1.add("e");							//Iterator implementation
		System.out.println(e2.nextElement());
		
	}
}
