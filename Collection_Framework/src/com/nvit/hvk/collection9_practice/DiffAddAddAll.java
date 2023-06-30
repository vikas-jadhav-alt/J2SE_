package com.nvit.hvk.collection9_practice;
import java.util.*;
class DiffAddAddAll{
	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		al1.add("a");
		al1.add("b");
		al1.add("c");

		ArrayList al2 = new ArrayList();
		al2.addAll(al1);
		al2.add("d");
		al2.add("e");

		ArrayList al3 = new ArrayList();
		al3.add(al1);
		al3.add("f");

		System.out.println(al1.size());
		System.out.println(al2.size());
		System.out.println(al3.size());
		System.out.println(al1);
		System.out.println(al2);
		System.out.println(al3);

	}
}
