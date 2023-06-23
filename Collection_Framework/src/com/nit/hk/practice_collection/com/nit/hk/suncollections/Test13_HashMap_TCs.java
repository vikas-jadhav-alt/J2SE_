package com.nit.hk.suncollections;

import java.util.HashSet;

public class Test13_HashMap_TCs {
	public static void main(String[] args) {
		HashSet<Ex> hs = new HashSet<>();
		hs.add(new Ex(5, 6));  		System.out.println(hs);
		hs.add(new Ex(7, 8));  		System.out.println(hs);
		hs.add(new Ex(6, 5));  		System.out.println(hs);
		hs.add(new Ex(7, 4));  		System.out.println(hs);
		hs.add(new Ex(1, 2));  		System.out.println(hs);
		hs.add(new Ex(3, 2));  		System.out.println(hs);
		hs.add(new Ex(3, 2));  		System.out.println(hs);
		Ex e8 = new Ex(5, 7);  		
		hs.add(e8);  				System.out.println(hs);
		hs.add(e8);  				System.out.println(hs);

	}
	
}
