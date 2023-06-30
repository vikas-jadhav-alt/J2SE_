package com.nvit.hvk.collection9_practice;
import java.util.*;

class Example{
	int x = 10;
	int y = 20;
	
	public int hashCode(){
		System.out.println("In hashCode()");	
		return 5;
	}
	public boolean equals(Object obj){
		System.out.println("In equals()");
		return false;
	}
}

class LHSTest{
	public static void main(String[] args){
		LinkedHashSet lhs = new LinkedHashSet();
	
		Example e1 = new Example();
		Example e2 = new Example();
		lhs.add(e1);
		lhs.add(e1);
		lhs.add(e2);
		lhs.add(new Example());

		System.out.println(lhs.size());
		System.out.println(lhs);
	}
};
