package com.nit.hk.suncollections;

public class B implements Comparable<B>{
	
	private int x ;
	private int y ;
	
	public B(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public int hashCode() {
		System.out.println("\nIn hc");
		return x + y;
	}	
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("In eq " + this + "  "+ obj);
		if(obj instanceof B b) {
			return this.x == b.x &&
						this.y == b.y;
		}
		return false;
	}
	
	@Override
	public int compareTo(B b) {
		return this.x - b.x;
	}
	
	@Override
	public String toString() {
		return "B(" + x + ", " + y + ")";
	}
	

	
}
