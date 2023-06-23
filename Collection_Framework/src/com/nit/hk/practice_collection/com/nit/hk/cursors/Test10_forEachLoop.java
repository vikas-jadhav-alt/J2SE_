package com.nit.hk.cursors;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test10_forEachLoop {
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("c");

		System.out.println(al);

		Iterator<String> itr1 = al.iterator();
		while (itr1.hasNext()) {
			String str = itr1.next();
			System.out.println(str.toUpperCase());
		}

//		for( var dec : array or Iterable object) {
//			//logic
//		}

		for (String str : al) {
			System.out.println(str.toUpperCase());
		}

		System.out.println(al);
		System.out.println();
//======================================================================		

		HashSet<Integer> hs = new HashSet<>();
		hs.add(5);
		hs.add(6);
		hs.add(7);

		System.out.println(hs);
		Iterator<Integer> itr2 = hs.iterator();
		while (itr2.hasNext()) {
			Integer integer = itr2.next();
			System.out.println(integer);
		}
		
		for( Integer io : hs) {
			System.out.println(io);
		}
////////////////////////////////////////////////////////////////////////////////
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
		lhm.put("a", 1);
		lhm.put("b", 2);
		lhm.put("c", 3);
		
		System.out.println(lhm);
		
		Set<Map.Entry<String, Integer>> entries = lhm.entrySet();
		Iterator<Map.Entry<String, Integer>> entiresItr = entries.iterator();
		while (entiresItr.hasNext()) {
			Map.Entry<String,Integer> entry = entiresItr.next();
			System.out.println(entry.getKey() +":"+entry.getValue());			
		}
		
		Set<Map.Entry<String, Integer>> entries2 = lhm.entrySet();
		for(Map.Entry<String, Integer> entry: entries2 ) {
			System.out.println(entry.getKey() +":"+entry.getValue());			
		}

//Rules in working for each loop

	
//Rule #1: The object we are using must be array or Iterable<T> type
//so we are allowed to pass array or any Collection as arguments
//we can not pass String, our own class, Map, Cursor objects as arguments
		
		//for(char ch: "abc") { }
		
		char[] ca  = {'a', 'b', 'c'};
		for(char ch: ca) { System.out.println(ch);}
		
		List<Integer> list = List.of(4, 5, 6, 7);
		for(int i : list) { System.out.println(i);}

		Map<Integer, String> map = Map.of(4, "a", 5, "b");
		//for(int i : map) { System.out.println(i);}
		
		Iterator<Integer> itr = list.iterator();
		//for(int i: itr) {}
		
//Rule #2: the variable type must be the object type or its super type
//returning from this array or Iterable object
//In general the variable type must be itr.next() method 
//return type
		
		List<Object> list2 = List.of(5, 6, 7);
		for(Object obj: list2) { }
		//for(int i: list2) { }
		//for(Integer i: list2) { }
		
		List<Integer> list3 = List.of(5, 6, 7);
		for(Object obj: list3) { }
		for(int i: list3) { }
		for(Integer i: list3) { }
		//for(String s: list3) { }
		
//Rule #3: We must declare variable in for()
		//we must not declare outside of for and can not
		//be used inside for()
		
		List<Integer> list4 = List.of(5, 6, 7);
		int i;
		//for(i : list4) {}
		for(int j : list4) {}
		
//Rule 4: The variable declared in for() can be used
		//only in for body, can not be used after for() loop
		List<Integer> list5 = List.of(5, 6, 7);
		for(int k : list5) {}
		//System.out.println(k);
		
//Rule #5: The separator between variable dec and object must 
		//be : but not ; or =
	
		//for(int k ; list5) {}
		//for(int k = list5) {}
		for(int k : list5) {}
	}
}
