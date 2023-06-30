//Develop a program to find number of occurrences of each element available in an array
//For example: 
	//Input: [123,123,345,345,123, 376,345, 786]
	//Output: 
		//123 - 2
		//345 - 2
		//376 - 1
		//786 - 1

package com.nvit.hvk.practice_collection.com.nit.hk.suncollections;

import java.util.LinkedHashMap;
import java.util.Set;

class OccurrencesFinder {	
	public static void findingOccrrences(int[] ia) {
		LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>();
		
		for(int i=0; i<ia.length; i++) {
			int count = 1;
			int ele = ia[i];

			if(!lhm.containsKey(ele)) {
				lhm.put(ele, count);
			}else {
				continue;
			}

			for(int j=i+1; j<ia.length; j++ ) {
				if(ele == ia[j]) {
					lhm.put(ele, ++count);
				}
			}//inner loop close
		}//outer loop close
		
		//System.out.println(lhm);
		
		Set<Integer> keys = lhm.keySet();
				
		for(Integer key : keys) {
			System.out.println(key+"="+lhm.get(key));
		}
		
	}//method close
}	

public class Test17_CountingNumberOfOccurrences {
	public static void main(String[] args) {
		int[] ia = {123,123,345,345,123, 376,345, 786};
		OccurrencesFinder.findingOccrrences(ia);
	}
}
