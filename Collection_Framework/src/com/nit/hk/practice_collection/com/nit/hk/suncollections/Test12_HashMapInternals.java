package com.nit.hk.suncollections;

import java.util.HashMap;

public class Test12_HashMapInternals {
	public static void main(String[] args) {
		
		HashMap<Object, Object> hm = new HashMap<>();
//		System.out.println(hm.isEmpty());
//		System.out.println(hm.size());
//		System.out.println(hm);
		System.out.println();
		
//		System.out.println(hm.put("a", 1));
//		System.out.println(hm.put("a", 2));
//		System.out.println(hm.put("b", 3));
//		System.out.println(hm.put(5, 3));
//		System.out.println(hm.put(true, 4));
//		System.out.println(hm.put(6.7, 5));
//		System.out.println(hm.put('p', 6));
		hm.put(new A(5,6), 7);  	System.out.println(hm);
		hm.put(new A(5,6), 8);			System.out.println(hm);
		A a3 = new A(7, 8);
		hm.put(a3, 9);System.out.println(hm);
		hm.put(a3, 10);		System.out.println(hm);
	
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
	}
	
}
