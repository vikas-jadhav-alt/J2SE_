package com.nvit.hvk.practice_collection.com.nit.hk.suncollections;

public class C {
	private int i;
	private double d;
	private String s;

	public C(int i, double d, String s) {
		this.i = i;
		this.d = d;
		this.s = s;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "C(" + i + ", " + d + ", " + s + ")";
	}
	
	
	
}
