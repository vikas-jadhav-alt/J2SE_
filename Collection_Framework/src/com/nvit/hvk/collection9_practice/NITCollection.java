package com.nvit.hvk.collection9_practice;
//NITCollection.java
public class NITCollection{

	private Object[] objArray;

	private int incrementalCapacity;
	private int index = 0;

	public NITCollection(){
		this( 5 );
	}

	public NITCollection(int incrCap){
		objArray = new Object[10];
		incrementalCapacity = incrCap;
	}

	public NITCollection(NITCollection col){

		//creating array object with given collection size to store all its elements in this collection object

		objArray = 
			new Object[ col.size() ];

		this.incrementalCapacity = 
						capacity() / 2;

		for (int i = 0; i <= col.size() ; i++){
			this.add( col.get(i) );
		}

	}

	public void add(Object ele){
		if( size() == capacity() ){
			incrementCapacity();
		}
		objArray[index] = ele;
		index++;
	}

	public void incrementCapacity(){
	
		int newCap = 
			capacity() + incrementalCapacity;

		Object[] tempObj = 
			new Object[newCap];
			
		for (int i = 0; i < size() ; i++){
			tempObj[i] = objArray[i];
		}

		objArray = tempObj; 
	}
  	
	public Object get(int i){
		return objArray[i];
	}

	public int capacity(){
		return objArray.length;
	}
	public int size(){
		return index;
	}

	public void replace(int i, Object newEle){
		objArray[i] = newEle;
	}

	public void remove(int i){
		//algorithm: move next elements LEFT one index
	
	}

	public String toString(){
		StringBuilder sb = 
			new StringBuilder();
	
		sb.append("[");

		for (int i = 0; i < this.size(); i++){
			sb.append(this.get(i));
			sb.append(", ");
		}

		//deleting last ", "
		int start = sb.lastIndexOf(", ");	
		if( start != -1 ){
			int end = start+2;
			sb.delete(start, end);
		}		
		
		sb.append("]");

		//converting SB to String and returning it to Sopln stmt
		
		return sb.toString();
	}
}
