package com.nvit.hvk.practice_collection.com.nit.hk.cursors;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Test11_forEachMethod {
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("c");

		System.out.println(al);

		for (String str : al) {
			System.out.println(str.toUpperCase());
		}
		System.out.println();
		
		al.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		});
		System.out.println();
		
		al.forEach((String s) -> {
				System.out.println(s);
		});
		System.out.println();
		
		al.forEach((String s) -> System.out.println(s)); System.out.println();
		
		al.forEach((s) -> System.out.println(s)); System.out.println();
		
		al.forEach(s -> System.out.println(s)); System.out.println();

		al.forEach(System.out::println); System.out.println();
		
		al.forEach(s -> System.out.println(s.toUpperCase())); System.out.println();
		System.out.println();
///////////////////////////////////////////////////////////////////////////////////
		
		Set<String> set = Set.of("a", "b", "c", "d");
		set.forEach(s -> System.out.println(s)); System.out.println();
		set.forEach(System.out::println);
		System.out.println();
///////////////////////////////////////////////////////////////////////////////////
		
		Map<Integer, String> map = Map.of(1, "a", 2, "b");
		map.forEach(new BiConsumer<Integer, String>(){
			@Override
			public void accept(Integer k, String v) {
				System.out.println(k + "  " + v);	
			}
		});
		System.out.println();

		map.forEach((Integer k, String v) -> {
				System.out.println(k + "  " + v);	
		});
		System.out.println();
		
		map.forEach((k, v) -> System.out.println(k + "  " + v));
		System.out.println();
///////////////////////////////////////////////////////////////////////////////////
		Map<Integer, String> map2 = Map.of(1, "a", 2, "b");
		map2.forEach((k, v) -> System.out.println(k + "  " + v));
		
		
	}
}