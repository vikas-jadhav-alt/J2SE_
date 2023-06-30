package com.nvit.hvk.practice_collection.com.nit.hk.suncollections;

import java.util.TreeSet;

public class Test15_TreeSet {
	public static void main(String[] args) {
		
		TreeSet<Object> ts1 = new TreeSet<>();
		ts1.add("a");  //
		ts1.add("c");	//"c".compareTo("a") -> +ve -> RIGHT SIDE
		ts1.add("b");	//"b".compareTo("a") -> +ve -> RIGHT SIDE
						//"b".compareTo("c") -> -ve -> LEFT SIDE
		System.out.println(ts1);
		
		//ts.add(5);
		//ts.add(null);
		
		TreeSet<Integer> ts2 = new TreeSet<>();
		ts2.add(5);
		ts2.add(7);
		ts2.add(6);
		System.out.println(ts2);
		
		TreeSet<B> ts3 = new TreeSet<>();
		ts3.add(new B(5, 9));	//b1.compareTo(b1) //ignored stored
		ts3.add(new B(7, 2));	//b2.compareTo(b1) 	-> +ve -> RS
		ts3.add(new B(6, 4));   //b3.compareTo(b1)	-> +ve -> RS
								//b3.compareTo(b2)	-> -ve -> LS
		
		ts3.add(new B(6, 4));
		ts3.add(new B(6, 4));
		System.out.println(ts3);
		
		
		TreeSet<B> ts4 = new TreeSet<>(new BxDescComparator());
		ts4.add(new B(5, 9));	//
		ts4.add(new B(7, 2));	//cmpr.compare(b2, b1) 	-> -ve -> LS
		ts4.add(new B(6, 4));   //cmpr.compare(b3, b1)	-> -ve -> LS
								//cmpr.compare(b3, b2)	-> -ve -> RS
		
		ts4.add(new B(6, 4));
		ts4.add(new B(6, 4));
		System.out.println(ts4);
		
		
		TreeSet<C> ts5 = new TreeSet<>((c1, c2) -> c1.getI() - c2.getI());
		ts5.add(new C(5, 8.4, "c"));
		ts5.add(new C(7, 8.3, "b"));
		ts5.add(new C(6, 8.2, "a"));
		System.out.println(ts5);
		
		TreeSet<C> ts6 = new TreeSet<>((c1, c2) -> (int)(c1.getD() - c2.getD()));
		ts6.add(new C(5, 8.4, "c"));
		ts6.add(new C(7, 8.3, "b"));
		ts6.add(new C(6, 8.2, "a"));
		System.out.println(ts6);
		
		TreeSet<C> ts7 = new TreeSet<>((c1, c2) -> {
												double diff = c1.getD() - c2.getD();
												if(diff <0) 
													return -1;
												else if(diff > 0) 
													return 1;
												else 
													return 0;
										});
		
		ts7.add(new C(5, 8.4, "b"));
		ts7.add(new C(7, 8.3, "c"));
		ts7.add(new C(6, 8.2, "a"));
		System.out.println(ts7);
		
		TreeSet<C> ts8 = new TreeSet<>(
							(c1, c2) -> c1.getS().hashCode() - c2.getS().hashCode());
											
		ts8.add(new C(5, 8.4, "b"));
		ts8.add(new C(7, 8.3, "c"));
		ts8.add(new C(6, 8.2, "a"));
		System.out.println(ts8);
		
		
	}
}
