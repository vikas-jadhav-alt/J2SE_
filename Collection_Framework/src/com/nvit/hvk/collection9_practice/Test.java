package com.nvit.hvk.collection9_practice;
//Test.java
class Test{
	public static void main(String[] args){
		
		NITCollection col = 
			new NITCollection();

		System.out.println(col.capacity());
		System.out.println(col.size());
		System.out.println(col);
		System.out.println();

		col.add("Hari");
		col.add("NareshIT");
		col.add(50);
		col.add("BB");
		col.add(60);
		col.add("MB");
		col.add(50);
		col.add("Raju");
		col.add("Rani");
		col.add("Rama");
		col.add("Sita");

		System.out.println(col.capacity());
		System.out.println(col.size());
		System.out.println(col);
	
	}
}
