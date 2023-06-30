package com.nvit.hvk.practice_collection.com.nit.hk.suncollections;

public class Ex {
	
	private int x;
	private int y;
	
	public Ex(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int hashCode() {
		//int hash = x + y;
		System.out.println("\nIn hc "+this + "  " + 5);
		return 5;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("In eq");
//		if(obj instanceof Ex a) {
//			System.out.println("In eq " + this +  "  " + obj + "  "+ (this.x+this.y) + "  "+ (a.x+a.y)); 
//			return this.x == a.x &&
//						this.y == a.y;
//		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Ex("+x+","+y+")";
	}
	
}
