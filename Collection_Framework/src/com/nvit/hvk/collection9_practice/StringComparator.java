package com.nvit.hvk.collection9_practice;
import java.util.*;

class StringComparator implements Comparator  {
	public int compare(Object o1, Object o2) {
			String s1 = (String)o1;
			String s2 = (String)o2;

			return s2.compareTo(s1);
	}
}
