package com.nvit.hvk.collection9_practice;
//A.java
class A{
	private int x, y;
	public A(int x, int y){
		this.x = x;
		this.y = y;
	}
	public void setXY(int x, int y){
		this.x = x;
		this.y = y;
	}

	public String toString(){
		return "A("+x+", "+y+")";
	}

	public int hashCode(){
		return x + y;
	}

	public boolean equals(Object obj){
		if (obj instanceof A){		
			A a = (A)obj;	
			return (	
					( this.x == a.x )
						&&
					( this.y == a.y ) 
				   );	
		}

		return false;
	}
}
