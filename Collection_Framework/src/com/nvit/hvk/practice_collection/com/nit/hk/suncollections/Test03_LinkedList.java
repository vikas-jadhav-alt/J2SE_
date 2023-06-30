
package com.nvit.hvk.practice_collection.com.nit.hk.suncollections;

import java.util.LinkedList;

public class Test03_LinkedList {
	public static void main(String[] args) {
		
		LinkedList<Object> linkeList = new LinkedList<>();
//Operation #1: finding empty or not
		System.out.println(linkeList.isEmpty());
		
//Operation #2: finding size
		System.out.println(linkeList.size());
		
//Operation #3: printing elements
		System.out.println(linkeList);
		System.out.println();
		
//Operation #4: adding elements
		linkeList.add("a");
		linkeList.add("b");
		linkeList.add(5);
		linkeList.add(6.7);
		linkeList.add(null);
		linkeList.add(new A(5,6));
		linkeList.add("a");
		linkeList.add(null);
		
		System.out.println(linkeList.isEmpty());
		System.out.println(linkeList.size());
		System.out.println(linkeList);
		System.out.println();
		
//Operation #5: searching elements -> ==operator and equals() method are used
		System.out.println(linkeList.contains("a"));  //Linear search algorithm
		System.out.println(linkeList.contains(5));
		System.out.println(linkeList.contains(null));
		System.out.println(linkeList.contains(new A(5, 6)));
		System.out.println();
		
		System.out.println(linkeList.indexOf("a")); //Linear search algorithm
		System.out.println(linkeList.indexOf("A"));
		System.out.println(linkeList.indexOf(null));
		System.out.println(linkeList.indexOf(new A(5, 6)));
		System.out.println();
		
//Operation #6: retrieving element		
		System.out.println(linkeList);
		System.out.println(linkeList.get(3)); 		//Binary search algorithm
		System.out.println();
//Operation #7: removing element 		
		System.out.println(linkeList);
		System.out.println(linkeList.remove(4));	//Binary search algorithm
		System.out.println(linkeList);
		
		System.out.println(linkeList.remove(new A(5, 6)));
		System.out.println(linkeList);
		
//Operation #8: inserting element
		linkeList.add(3, "X");          //Binary search algorithm
		System.out.println(linkeList);
		
//Operation #9: replacing element		
		linkeList.set(2, "Y");			//Binary search algorithm
		System.out.println(linkeList);
		
//Operation #10: sorting element
		linkeList.clear();
		linkeList.add("a");
		linkeList.add("c");
		linkeList.add("b");
		System.out.println(linkeList);
		linkeList.sort(null);
		System.out.println(linkeList);
		
	}
}
