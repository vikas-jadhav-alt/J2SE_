package com.nvit.hvk.collection9_practice;
import java.util.*;
class NIT {
	public static void main(String[] args) {
		LinkedHashMap lhm = new LinkedHashMap();

		lhm.put( new Student(1, "St1", 7) , new Address(1, "Hyd") );
		lhm.put( new Student(2, "St2", 7) , new Address(2, "Hyd") );
		lhm.put( new Student(3, "St3", 2) , new Address(3, "Hyd") );
		lhm.put( new Student(3, "St3", 2) , new Address(4, "Sec") );

		System.out.println(lhm);
		
		lhm.remove( new Student(2, "St2", 7));
		lhm.remove( new Student(3, "st3", 2));
		System.out.println(lhm);
		System.out.println(lhm.get( new Student(3, "st3", 2)));

		Student s1 = new Student(4, "St4", 7);
		lhm.put( s1, new Address(4, "Ameerpet") );
		System.out.println();
		System.out.println(lhm);

		s1.batch = 2;
		lhm.remove( new Student(4, "St4", 7));
		System.out.println();
		System.out.println(lhm);
	}
}
