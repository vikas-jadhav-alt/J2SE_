package com.nvit.hvk.practice_collection.com.nit.hk.suncollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test05_MakingListAsSynchronized{
	public static void main(String[] args) {
		
		ArrayList<Object> al1 = new ArrayList<>();
		al1.add("a"); //no-synchronized operation
		
		List<Object> list = Collections.synchronizedList(al1);
		list.add("b");//synchronized operation
		
		System.out.println(al1);
	}
}