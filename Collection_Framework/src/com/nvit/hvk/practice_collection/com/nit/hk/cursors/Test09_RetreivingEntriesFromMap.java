package com.nvit.hvk.practice_collection.com.nit.hk.cursors;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Test09_RetreivingEntriesFromMap {
	public static void main(String[] args) {
		
		LinkedHashMap<Object, Object> lhm = new LinkedHashMap<>();
		lhm.put("a", 1);
		lhm.put("b", 2);
		lhm.put(3, "c");
		lhm.put(4, "d");
		lhm.put(5, "e");
		System.out.println(lhm);
		
//Approach #1: get(key)
		Object obj = lhm.get("a");
		System.out.println(obj);
		System.out.println();
		
//Approach #2: retrieving all keys
		Set<Object> keys = lhm.keySet();
		Iterator<Object> keysItr = keys.iterator();
		while(keysItr.hasNext()) {
			Object key = keysItr.next();
			Object value = lhm.get(key);
			
			System.out.println(key+"="+value);
			System.out.println();
			
		}

//Approach #3: retrieving all values
		Collection<Object> values = lhm.values();
		Iterator<Object> valuesItr = values.iterator();
		while(valuesItr.hasNext()) {
			System.out.println(valuesItr.next());
		}
		
		System.out.println();
		
//Approach #4:		
		Set<Map.Entry<Object, Object>> entries = lhm.entrySet();
		Iterator<Map.Entry<Object, Object>> entriesItr = entries.iterator();
		while(entriesItr.hasNext()) {
			Map.Entry<Object, Object> entry = entriesItr.next();
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key +":"+value);
		}
		
	}
}
