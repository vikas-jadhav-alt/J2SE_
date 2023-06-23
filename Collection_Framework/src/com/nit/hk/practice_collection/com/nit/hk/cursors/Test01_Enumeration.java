package com.nit.hk.cursors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class Test01_Enumeration {
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		v.add("a");
		v.add("b");
		v.add("c");

	//obtaining Enumeration object	
		Enumeration<String> e = v.elements();
		
	//static nature code for retrieving elements	
		//System.out.println(e.hasMoreElements());
		//System.out.println(e.nextElement());
		//System.out.println(e.nextElement());
		//System.out.println(e.nextElement());
		//System.out.println(e.nextElement()); RE: NSEE
		//System.out.println(e.hasMoreElements());
		
	//dynamic nature code
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println();  
//==========================================================
	//Obtaining enumeration object by using Collections.enumeration() method
		Enumeration<String> e2 = Collections.enumeration(v);
		while(e2.hasMoreElements()) {
			System.out.println(e2.nextElement());
		}
		System.out.println();
//==========================================================
    //Obtaining enumeration object on AL by using Collections.enumeration() method
		ArrayList<String> al = new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("c");
		
		Enumeration<String> e3 = Collections.enumeration(al);
		while(e3.hasMoreElements()) {
			System.out.println(e3.nextElement());
		}	
		
	}
}
