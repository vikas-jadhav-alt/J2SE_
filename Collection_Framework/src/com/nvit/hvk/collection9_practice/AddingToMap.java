package com.nvit.hvk.collection9_practice;
import java.util.*;
class AddingToMap {
	public static void main(String[] args) {
		LinkedHashMap lhm = new LinkedHashMap();
		System.out.println(lhm.put(1, "Jr. NTR"));
		System.out.println("LHM entries");
		System.out.println(lhm);
		System.out.println();

		System.out.println(lhm.put(2, "MB"));
		System.out.println("LHM entries");
		System.out.println(lhm);
		System.out.println();

		System.out.println(lhm.put(1, "Tarak"));
		System.out.println("LHM entries");
		System.out.println(lhm);
	}
}
