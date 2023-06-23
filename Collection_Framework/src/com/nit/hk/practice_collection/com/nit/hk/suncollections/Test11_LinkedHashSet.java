package com.nit.hk.suncollections;

import java.util.LinkedHashSet;

public class Test11_LinkedHashSet{
	public static void main(String[] args) {
		
		LinkedHashSet<Object> lhs = new LinkedHashSet<>();
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.size());
		System.out.println(lhs);
		System.out.println();
		
		lhs.add("a");
		lhs.add("b");
		lhs.add(5);
		lhs.add(6.7);
		lhs.add(true);
		lhs.add(null);
		lhs.add(new A(5, 6));
		lhs.add("a");
		lhs.add(5);
		lhs.add(new A(5, 6));
		lhs.add(new A(7, 8));
		A a4 = new A(3, 4);
		lhs.add(a4);
		lhs.add(a4);
		lhs.add(null);
		lhs.add(null);
		
		System.out.println(lhs);
		System.out.println(lhs.size());
		System.out.println(lhs.isEmpty());
	}
}