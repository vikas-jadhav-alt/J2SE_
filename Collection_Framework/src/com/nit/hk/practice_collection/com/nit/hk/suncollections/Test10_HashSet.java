package com.nit.hk.suncollections;

import java.util.HashSet;

public class Test10_HashSet{
	public static void main(String[] args) {
		
		HashSet<Object> hs = new HashSet<>();
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		System.out.println(hs);
		System.out.println();
		
		hs.add("a");
		hs.add("b");
		hs.add(5);
		hs.add(6.7);
		hs.add(true);
		hs.add(null);
		hs.add(new A(5, 6));
		hs.add("a");
		hs.add(5);
		hs.add(new A(5, 6));
		hs.add(new A(7, 8));
		A a4 = new A(3, 4);
		hs.add(a4);
		hs.add(a4);
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
	}
}