package com.nvit.hvk.collection9_practice;
//VectorDemo.java
import java.util.Vector;
public class VectorDemo{
	public static void main(String args[]){
		Vector v = new Vector();			
		for(int i = 0 ; i <= 9 ; i++){
			v.addElement(new Integer(i*10));
		}
		System.out.println("Initial elements: "+v);

		v.removeElementAt(0);
		v.removeElementAt(1);

		System.out.println("elements after removing: "+v);
		
}
 }
