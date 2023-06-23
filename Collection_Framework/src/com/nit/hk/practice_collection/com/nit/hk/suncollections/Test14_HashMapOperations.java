package com.nit.hk.suncollections;

import java.util.LinkedHashMap;

public class Test14_HashMapOperations {
	public static void main(String[] args) {
		LinkedHashMap<Object, Object> lhm = new LinkedHashMap<>();
		
//Operation #1: finding empty or not
		System.out.println(lhm.isEmpty());  //void m1(Map map){ if(map.isEmpty(){ --} else {--}}
		
//Operation #2: finding size 
		System.out.println(lhm.size());
		
//Operation #3: displaying map
		System.out.println(lhm);
		System.out.println();
		
//Operation #3: adding entries
		System.out.println(lhm.put("a", 1));  //k1.hashCode() -> 97%16
		System.out.println(lhm.put("b", 2));
		System.out.println(lhm.put(5, 3));
		System.out.println(lhm.put(6.7, 4));
		System.out.println(lhm.put('p', 5));
		System.out.println(lhm.put(true, 6));
		System.out.println(lhm.put(null, 6));
		System.out.println(lhm.put("a", 7));
		System.out.println(lhm.put(5, 8));
		System.out.println(lhm.put(new B(5, 6), 9));
		System.out.println(lhm.put(new B(5, 6), 10));
		System.out.println(lhm.put(new B(7, 8), 11));
		System.out.println(lhm.put(new B(9, 2), new B(3, 4)));
		System.out.println(lhm.put(new B(1, 2), "a"));
				
		System.out.println(lhm); //lhm.toString() -> k.toString() and v.toString
		System.out.println(); 
	
//Operation #4: Searching a key	and value  //with one bucket eles linear search
		System.out.println(lhm.containsKey("a")); //sk.hashCode() -> 97%16 
												  //sk == key -> true
												  
		System.out.println(lhm.containsKey(new String("a"))); //sk.hashCode() -> 97%16
												//sk == key -> false
												//sk.equals(key) -> true
		
		System.out.println(lhm.containsKey("A"));//sk.hashCode() -> 65%16
		
		System.out.println(lhm.containsKey(null)); //0 index != null
												   //sk == key -> true
		
		System.out.println(lhm.containsKey(new B(5, 6))); //sk.hashCode() -> ref%16
		
		System.out.println();
		System.out.println(lhm.containsValue(3));			//linear search algo	
		System.out.println(lhm.containsValue("a"));			//hashCode() is not used
		System.out.println(lhm.containsValue(new B(3, 4))); //only equals() is used 	
		
//Operation #5:	retrieving the mapped value of a given key
		System.out.println(lhm);
		System.out.println(lhm.get("a")); //sk.hashCode() -> 97%16
										  //sk == node.key -> true
										  //return node.value
		
		System.out.println(lhm.get(new String("a")));//sk.hashCode() -> 97%16
										//sk == node.key -> false
										//sk.equals(node.key) -> true
										//retun node.value
		
		System.out.println(lhm.get("A")); //sk.hashCode() -> 65%16
											//return null
		
		System.out.println(lhm.getOrDefault("A", "the key \"A\" is not found"));
		
		System.out.println(lhm.get(new B(5,6))); //sk.hashCode() -> 11%16
												//sk == node.key -> false
												//sk.equals(node.key) -> true
												//return node.value
		System.out.println();
		
//Operation #6: removing entry
		System.out.println(lhm);
		
		System.out.println(lhm.remove("a")); //sk.hashCode() -> 97%16
											  //sk == node.key -> true
											  //remove(node)
		
		System.out.println(lhm.remove(new B(5, 6))); //sk.hashCode() -> 11%16
											  	//sk == node.key -> false
												//sk.equals(node.key) -> true
												//remove(node)
		
		System.out.println(lhm.remove(5, 7));	//sk.hashCode() -> 5%16
												//sk == node.key -> true
												//sv.equals(node.value) ->false
												//not removed
		
		System.out.println(lhm);
		
//Operation #7: replacing the value of the given key
		System.out.println(lhm.put(5, 9));
		System.out.println(lhm.replace('p', 17));
		System.out.println(lhm.replace(true, 6, 18));
		System.out.println(lhm.replace(new B(7, 8), 7, 19));
		System.out.println(lhm);
		
		
	}
}
